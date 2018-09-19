package services;



import models.Partner;

import io.ebean.Ebean;
import io.ebean.SqlRow;


public class DatabaseService{


    public static void insertNewPartner(String name, String email, String password, String url ) {

        Partner partner = new Partner(name, email, password, url);
        partner.save();
    }
    public static String authenticate(String email) {

        String sql = "select email, password from partner p where p.email = (:email);";
        SqlRow sqlRow = Ebean.createSqlQuery(sql).setParameter("email", email).findUnique();
        String password = new String(sqlRow.getString("password")));
        return password;
    }




}
