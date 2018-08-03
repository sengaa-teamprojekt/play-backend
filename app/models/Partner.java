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
import play.data.format.Formats;

@Entity
public class Partner extends Model {

    public static final Finder<Long, Partner> find = new Finder<Long, Partner>(Partner.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String url;

  /**  @Column(nullable = false)
    private Formats.DateTime created_at;

    @Column(nullable = false)
    private Formats.DateTime updated_at;

    @Column(nullable = true)
    private String image_file_name;

    @Column(nullable = true)
    private String image_content_type;

    @Column(nullable = true)
    private String image_file_size;

    @Column(nullable = true)
    private Formats.DateTime image_updated_at;
*/


    public Partner(String name, String email, String password, String url) {
        super();
        this.name = name;
        this.url = url;
    }

    public String getName() {

        return name;
    }

}
