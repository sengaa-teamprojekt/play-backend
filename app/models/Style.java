package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.ebean.Finder;
import io.ebean.Model;

@Entity
public class Style extends Model {

    public static final Finder<Long, Style> find = new Finder<Long, Style>(Style.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    private String name;


    public Style(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
