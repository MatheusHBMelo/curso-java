package application;

import model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        // Insert
        Pessoa p1 = new Pessoa(null, "Max", "max@email.com");
        try {
            emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(p1);
            em.getTransaction().commit();
        } catch (RuntimeException e){
            if (em != null && em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw new RuntimeException(e.getMessage());
        } finally {
            if (em != null){
                em.close();
            }
            if (emf != null){
                emf.close();
            }
        }

        // Update
        Pessoa p2 = em.find(Pessoa.class, 2);
        p2.setName("Silvania");
        p2.setEmail("silvania@email.com");
        try {
            emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.merge(p2);
            em.getTransaction().commit();
        } catch (RuntimeException e){
            if (em != null && em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw new RuntimeException(e.getMessage());
        } finally {
            if (em != null){
                em.close();
            }
            if (emf != null){
                emf.close();
            }
        }

        // RemoveById
        Pessoa p3 = em.find(Pessoa.class, 3);
        try {
            emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.remove(p3);
            em.getTransaction().commit();
        } catch (RuntimeException e){
            if (em != null && em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw new RuntimeException(e.getMessage());
        } finally {
            if (em != null){
                em.close();
            }
            if (emf != null){
                emf.close();
            }
        }

        // FindById
        try {
            emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            em = emf.createEntityManager();
            Pessoa p4 = em.find(Pessoa.class, 4);
            System.out.println(p4);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }

        // FindAll
        try {
            TypedQuery<Pessoa> query = em.createQuery("SELECT p FROM Pessoa p", Pessoa.class);
            List<Pessoa> pessoas = query.getResultList();
            for (Pessoa p : pessoas) {
                System.out.println(p);
            }
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
