package models;

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
        Result result1 = Result.builder().player1(result.getPlayer1()).player2(result.getPlayer2()).score1(result.getScore1()).score2(result.getScore2()).winner(result.getWinner()).build();
        try {
            em.getTransaction().begin();
            em.persist(result1);
            em.getTransaction().commit();
            System.out.println(result1);
        } finally {
            em.close();
        }
    }

    /*private static List<Result> getUsers() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT l FROM LegoSet l ORDER BY l.number", LegoSet.class).getResultList();
        } finally {
            em.close();
        }
    }

    private static Long getTotalMatchesPlayed() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT SUM(pieces) FROM LegoSet l", Long.class).getSingleResult();
        } finally {
            em.close();
        }
    }

    private static void deleteLegoSets() {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            long count = em.createQuery("DELETE FROM LegoSet").executeUpdate();
            logger.info("Deleted {} LEGO set(s)", count);
            em.getTransaction().commit();
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