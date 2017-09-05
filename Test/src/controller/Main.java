package controller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

import model.Member;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "Test";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select name from member where name LIKE 'Arthur'");
        List<Member> todoList = q.getResultList();
        for (Member todo : todoList) {
            System.out.println(todo);
        }
        System.out.println("Size: " + todoList.size());


        em.close();
    }
}
