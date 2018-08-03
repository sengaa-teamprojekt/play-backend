package services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import models.Partner;
import org.apache.commons.lang3.time.DateUtils;

import dto.EmployeeAuthenticationDTO;
import io.ebean.Ebean;
import io.ebean.SqlRow;


public class DatabaseService2 {

    /**
     * Queries the attributes is_Controller and pw from the DB to do the authentication
     * @param employeeId - ID of the employee to authenticate
     * @return DTO containing the required information

    public static EmployeeAuthenticationDTO queryEmployeePwAndIsController(Integer id) {
        String sql = "select name, password from partner p where p.id = (:id);";
        SqlRow sqlRow = Ebean.createSqlQuery(sql).setParameter("id", id).findUnique();
        EmployeeAuthenticationDTO authentication = new EmployeeAuthenticationDTO(sqlRow.getString("password"));
        return authentication;
    } */
    
    /**
     * Inserts a new entry in the Task table of the database
     * * @param dateString - Date of the task as a String

     */
    public static void insertNewPartner(String name, String email, String password, String url ) {

        Partner partner = new Partner(name, email, password, url);
        partner.save();
    }
    
    public static String queryEmployeeName(Integer employeeId) {
        String sql = "select name, last_name from employee e where e.id = (:employeeId);";
        SqlRow sqlRow = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findUnique();
        String fullname = new String(sqlRow.getString("name") + " " + sqlRow.getString("last_name"));
        return fullname;
    }

}
