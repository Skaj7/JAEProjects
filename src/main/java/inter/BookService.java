package inter;

/**
 * Created by Kaj Suiker on 8-3-2017.
 */
import domain.Book;

import javax.ejb.Local;

@Local
public interface BookService {
    Book createOrUpdate(Book book);
    void remove(Book book);
    Book find(Object id);
}
