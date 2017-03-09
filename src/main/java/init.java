import dao.BookServiceBean;
import domain.Book;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;

/**
 * Created by Kaj Suiker on 8-3-2017.
 */
@Singleton
@Startup
public class init {

    @Inject
    BookServiceBean cd;// = new BookServiceBean();

    @PostConstruct
    public void init(){
        Logger log = Logger.getLogger("warning");
        log.info("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        System.out.println("neeyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        Book book = new Book( "black roast");
        cd.createOrUpdate(book);
        String s = cd.find(1).GetTitle();
    }

}
