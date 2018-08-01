package services;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import dto.EmployeeAuthenticationDTO;
import io.ebean.Ebean;
import io.ebean.SqlRow;


public class DatabaseService2 {

    /**
     * Queries the attributes is_Controller and pw from the DB to do the authentication
     * @param employeeId - ID of the employee to authenticate
     * @return DTO containing the required information
     */
    public static EmployeeAuthenticationDTO queryEmployeePwAndIsController(Integer id) {
        String sql = "select name, password from partner p where p.id = (:id);";
        SqlRow sqlRow = Ebean.createSqlQuery(sql).setParameter("id", id).findUnique();
        EmployeeAuthenticationDTO authentication = new EmployeeAuthenticationDTO(sqlRow.getString("password"));
        return authentication;
    }
    
    /**
     * Inserts a new entry in the Task table of the database
     * @param timeSpent - Time spent on the task
     * @param dateString - Date of the task as a String
     * @param notes - Notes to the task
     * @param projectId - ID of the project related to the task
     * @param employeeId - ID of the employee that fulfilled the task
     */
    public static void insertNewTask(Double timeSpent, String dateString, String notes, Integer projectId, Integer employeeId) {
        //Convert the date String into a Date object
        Date date = new Date();
        try {
            DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            date = format.parse(dateString);
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //Needed because the date sent starts counting the months from 0
        Date newDate = DateUtils.addMonths(date, 1);
        Project project = Project.find.query().where().idEq(projectId).findUnique();
        Employee employee = Employee.find.query().where().idEq(employeeId).findUnique();
                
        Task task = new Task(timeSpent, newDate, project, employee, notes);

        task.save();
    }
    
    public static String queryEmployeeName(Integer employeeId) {
        String sql = "select name, last_name from employee e where e.id = (:employeeId);";
        SqlRow sqlRow = Ebean.createSqlQuery(sql).setParameter("employeeId", employeeId).findUnique();
        String fullname = new String(sqlRow.getString("name") + " " + sqlRow.getString("last_name"));
        return fullname;
    }

}
