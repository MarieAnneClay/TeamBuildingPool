package controller;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.Vector;

import model.CRClass;
import model.CodeReview;
import model.Member;

public class Main {
	private static Vector<CodeReview> codeReviews=new Vector<CodeReview>();
	private static Vector<Member> members=new Vector<Member>();
	private static Vector<CRClass> classes=new Vector<CRClass>();
	private static final String PERSISTENCE_UNIT_NAME = "Test";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
    	factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
		members = getMembers(em);
		for (Member todo : members) {
            System.out.println(todo.getName());
        }
		
		codeReviews = getCodeReviews(em);
		for (CodeReview todo : codeReviews) {
            System.out.println(todo.getName());
        }
		
		classes = getClasses(em);
		for (CRClass todo : classes) {
            System.out.println(todo.getName());
        }
		Member member = new Member();
		member = members.get(6);
		member.setName("YOLO");
		member.setEmail("YOLO");
		updateMember(member, em);

        em.close();
    }
    
    public static Vector<CodeReview> getCodeReviews(EntityManager em) {
		Query q = em.createQuery("select cr from CodeReview cr ");
		codeReviews = ((Vector) q.getResultList());
		return codeReviews;
	}

	public static void setCodeReview(CodeReview codeReview,EntityManager em) {
		em.getTransaction().begin();
		em.persist(codeReview);
		em.getTransaction().commit();
	}

	public static Vector<Member> getMembers(EntityManager em) {
		Query q = em.createQuery("select m from Member m ");
		members = ((Vector) q.getResultList());
		return members;
	}

	public static void setMember(Member member,EntityManager em) {
		em.getTransaction().begin();
		em.persist(member);
		em.getTransaction().commit();
	}
	
	public static int deleteMember(int id,EntityManager em) {
		em.getTransaction().begin();
		Query q = em.createQuery("DELETE FROM Member WHERE id = :id");
		q.setParameter("id", id);
		int result = q.executeUpdate();
		em.getTransaction().commit();
		return result;
	}
	
	public static int updateMember(Member member,EntityManager em) {
		em.getTransaction().begin();
		Query q = em.createQuery(" UPDATE Member SET name= :name"
				+ ", email= :email"
				+ ", birthdate= :birthdate"
				+ ", crclassId= :crclass_id "
				+ " WHERE id = :id ");
		
		q.setParameter("name", member.getName());
		q.setParameter("email", member.getEmail());
		q.setParameter("birthdate", member.getBirthdate());
		q.setParameter("crclass_id", member.getCrclassId());
		q.setParameter("id", member.getId());
		int result = q.executeUpdate();
		em.getTransaction().commit();
		return result;
	}

	public static Vector<CRClass> getClasses(EntityManager em) {
		Query q = em.createQuery("select crc from CRClass crc ");
		classes = ((Vector) q.getResultList());
		return classes;
	}

	public static void setClasse(CRClass classe, EntityManager em) {
		em.getTransaction().begin();
		em.persist(classe);
		em.getTransaction().commit();
	}

}
