package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.DatabaseService;
import services.DatabaseService2;


/**
 * Controller for the TimeRecording-requests (Employee-View).
 * 
 * TODO: Employee- Feature Team
 */
public class LoginController extends Controller {
    
    


    
    /**
     * Authenticate method: Gets JSON;
     * parses employeeId and password and compares it with the pw stored in the DB
     * responses with JSON {"authenticated":"true"} if pw correct or {"authenticated":"false"} if not
     * Attention: Currently no encryption!
     * Tested with POSTMAN:
     * Example request: 
     * POST http://localhost:9000/login Headers Content-Type application/json Body {"employeeId":1,"pw":"thomas"} RESPONSE Body {"authenticated":"true"}
     * 
     */
    public Result authenticate() {
        JsonNode json = request().body().asJson();
        String username = json.findPath("username").textValue();
        String pw = json.findPath("password").textValue();
        if(username == null || pw == null) {                           //currently only checking if either id or pw is missing and sending badRequest
            return badRequest("Missing parameter [id] or [pw]");
        } else {
            String pwQuery = DatabaseService2.queryEmployeePwAndIsController(username).getPw();
            if(pw.equals(pwQuery)) {
                ObjectNode result = Json.newObject();
                result.put("authenticated", true);
                return ok(result);
            }else {
                ObjectNode result = Json.newObject();
                result.put("authenticated", false);
                return ok(result);
            }
        }
    }
    
    /**
     * getProjects method taken from EmployeeAnalyticsController: 
     * responses in JSON with all projects included according to employeeId
     * Example request: 
     * GET http://localhost:9000/recording/1/projects
     * RESPONSE:
     * {"header":"employeeProjects","payload":{"employeeId":1,"employeeProjects":
     * [{"projectId":1,"projectName":"Build IT System","workingHours":400.0},
     * {"projectId":2,"projectName":"Blueprint","workingHours":80.0}]}}
     * 
     */
    public Result getProjects(Integer id) {
        JsonNode employeeProjects = Json.toJson(DatabaseService.queryEmployeeProjects(id));
        ObjectNode result = Json.newObject();
        ObjectNode payload = Json.newObject();
        payload.put("employeeId", id);
        payload.set("employeeProjects", employeeProjects);
        result.put("header", "employeeProjects");
        result.set("payload", payload);
        return jsonResult(ok(result));
    }
    
    private Result jsonResult(Result httpResponse) {
        httpResponse.as("application/json; charset=utf-8");
        return httpResponse;
    }

}
