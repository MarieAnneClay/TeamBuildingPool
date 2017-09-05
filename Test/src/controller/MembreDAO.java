package controller;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Member;

//@Stateless

public class MembreDAO {

    @PersistenceContext( unitName = "Test" )

    private EntityManager em;


    public void trouver( String email )  {

    	Member utilisateur = null;

        Query requete = em.createQuery( "SELECT name FROM member WHERE name LIKE 'Arthur' ");

 

            utilisateur = (Member) requete.getSingleResult();

    

        System.out.println(utilisateur.getName());

    }

}
