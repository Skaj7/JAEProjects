package dao;

import domain.Book;
import org.junit.*;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

/**
 * Created by Kaj Suiker on 9-3-2017.
 */
public class BookServiceBeanTest {
    protected static EntityManagerFactory emf;

    protected EntityManager em;

    @BeforeClass
    public static void createEntityManagerFactory() {
        emf = Persistence.createEntityManagerFactory("abc");
    }

    @AfterClass
    public static void closeEntityManagerFactory() {
        emf.close();
    }

    @Before
    public void beginTransaction() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    @After
    public void rollbackTransaction() {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }

        if (em.isOpen()) {
            em.close();
        }
    }

    @Test
    public void createOrUpdate() throws Exception {
        BookServiceBean bsb = new BookServiceBean(em);
        bsb.createOrUpdate(new Book("werkt"));
    }

    @Test
    public void find() throws Exception {

    }

}