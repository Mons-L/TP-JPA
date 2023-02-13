import model.Formateur;
import model.Formation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){

        // Initialisation des objets permettant l'interaction avec la BDD
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tpHibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Ouverture d'une transaction
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        // Creation du formateur
        Formateur formateurGeorge = new Formateur("George", "34", "M");

        // Creation d'une formation
        Formation hibernateFormation = new Formation("Hbernate", 3, "Paris", formateurGeorge);

        // Persister les données dans la BDD
        entityManager.persist(formateurGeorge);
        entityManager.persist(hibernateFormation);

        // Commit (fermeture de la transaction)
        entityTransaction.commit();

        // Fermeture de la connexion à la BDD
        entityManager.close();
        entityManagerFactory.close();
    }
}