package main.java.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Kaj Suiker on 8-3-2017.
 */
@Entity
public class Coffee {
    private int id;
    private String taste;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "taste")
    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coffee coffee = (Coffee) o;

        if (id != coffee.id) return false;
        if (taste != null ? !taste.equals(coffee.taste) : coffee.taste != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (taste != null ? taste.hashCode() : 0);
        return result;
    }
}
