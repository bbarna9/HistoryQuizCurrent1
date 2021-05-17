package models;

import org.tinylog.Logger;

import java.time.Year;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

public class Database {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("previousresults-mysql");

    public static void addResults(Result result) {
        EntityManager em = emf.createEntityManager();
        Result result1 = Result.builder().Player1(result.getPlayer1()).Player2(result.getPlayer2()).Score1(result.getScore1()).Score2(result.getScore2()).Winner(result.getWinner()).build();
        try {
            em.getTransaction().begin();
            em.persist(result1);
            em.getTransaction().commit();
            System.out.println(result1);
            Logger.info("Loading data to online database.");
        } finally {
            em.close();
        }
    }

    public static List<Result> getResults() {
        EntityManager em = emf.createEntityManager();
        try {
            Logger.info("Pulling data from online database");
            return em.createQuery("SELECT r FROM Result r ORDER BY r.id DESC", Result.class).getResultList();
        } finally {
            em.close();
        }
    }
/*
    private static Long getTotalMatchesPlayed() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT SUM(pieces) FROM LegoSet l", Long.class).getSingleResult();
        } finally {
            em.close();
        }
    }


    public static void main(String[] args) {
        createLegoSets();
        getLegoSets().forEach(logger::info);
        logger.info("Total pieces: {}", getTotalPieces());
        deleteLegoSets();
        emf.close();
    }*/
}