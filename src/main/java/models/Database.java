package models;

import org.tinylog.Logger;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * This model contains data about how the database is filled and later pulled.
 */
public class Database {

    /**
     * We create a new entity manager, which gets our {@code previousresults-mysql} as a parameter.
     * */
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("previousresults-mysql");

    /**
     * This function loads in the results of a game every time the result screen is loaded. This is achieved by
     * creating a new entitymanager, with the help of what we start a transaction with all of the data we store in a match.
     * @param result it requires a {@link models.Result} entity.
     */
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

    /**
     * This function pulls data from our online database, by simply creating a quesry with the selected data (in this case
     * everything), then returning with this as a list.
     * @return
     */
    public static List<Result> getResults() {
        EntityManager em = emf.createEntityManager();
        try {
            Logger.info("Pulling data from online database");
            return em.createQuery("SELECT r FROM Result r ORDER BY r.id DESC", Result.class).getResultList();
        } finally {
            em.close();
        }
    }

    /**
     * This function works very familiar to the {@code getResults()} function, with the exception that instead of selecting
     * everything it counts the "rows" in our database, and returns with the exact number, making it possible to us to keep count
     * how many matches have been played so far.
     * @return with a simple number.
     */
    public static Long getTotalMatchesPlayed() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT COUNT(id) FROM Result l", Long.class).getSingleResult();
        } finally {
            em.close();
        }
    }
}