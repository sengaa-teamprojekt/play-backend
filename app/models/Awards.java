package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.format.Formats;

import javax.persistence.Column;
import java.math.BigInteger;
import java.util.Date;

public class Awards extends Model {

    public static final Finder<Long, Style> find = new Finder<Long, Style>(Style.class);


    @Column(nullable = false)
    private String title;


    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private Date valid_until;

    @Column(nullable = false)
    private String code;

    @Column(nullable = true)
    private BigInteger partner_id;

    @Column(nullable = false)
    private BigInteger challenge_id;

    @Column(nullable = false)
    private Integer level;

    @Column(nullable = false)
    private Formats.DateTime user_notified_at;

    @Column(nullable = false)
    private Formats.DateTime updated_at;

    @Column(nullable = false)
    private BigInteger style_id;

//fehlen noch die von den anderen modellen


    public Awards(String title, String description, Date valid_until, String code, BigInteger partner_id, BigInteger challenge_id, Integer level, Formats.DateTime user_notified_at, Formats.DateTime updated_at, BigInteger style_id) {
        this.title = title;
        this.description = description;
        this.valid_until = valid_until;
        this.code = code;
        this.partner_id = partner_id;
        this.challenge_id = challenge_id;
        this.level = level;
        this.user_notified_at = user_notified_at;
        this.updated_at = updated_at;
        this.style_id = style_id;
    }



}
