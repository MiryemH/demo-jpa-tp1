package fr.diginamic.core;

import fr.diginamic.core.entities.Region;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maConfig");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        System.out.println("Connexion Reussie");
        //extraire
        Region regionExtraite = em.find(Region.class, 28);
        if(regionExtraite != null)
            System.out.println(regionExtraite);
        else
            System.out.println("Aucune région a l'ID: 28");
        //insérer
        Region nvRegion = new Region(105,"Nouvelle Normandie",2900000);
        em.persist(nvRegion);
        //supprimer
        Region regionASupp = em.find(Region.class, nvRegion.getCodeRegion());
        if(regionASupp != null){
            em.remove(regionASupp);
            System.out.println(regionASupp.getNom() +" est supprimée de la BDD");
        }
        else
            System.out.println("Aucune région a l'ID:"+ regionASupp.getCodeRegion());
        transaction.commit();
        em.close();
    }
}
