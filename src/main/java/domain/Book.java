package domain;

/**
 * Created by Kaj Suiker on 8-3-2017.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book{

    @Id
    @GeneratedValue
    private Long id;
    private String title;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
    }

    public String GetTitle(){
        return title;
    }
}