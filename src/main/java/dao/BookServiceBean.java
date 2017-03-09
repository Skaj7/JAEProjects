package dao;

import domain.Book;
import inter.BookService;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Kaj Suiker on 8-3-2017.
 */
@Stateless
public class BookServiceBean implements BookService {
    @PersistenceContext(unitName = "abc")
    private EntityManager em;

    public BookServiceBean(EntityManager em) {
        this.em = em;
    }

    public Book createOrUpdate(Book book) {
        em.persist(book);
        return book;
    }
    public void remove(Book book) {
        em.remove(em.merge(book));
    }
    public Book find(Object id) {
        return em.find(domain.Book.class, id);
    }
}
