package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.DatabaseService;
import services.DatabaseService2;



public class RegistrationController extends Controller {


    /**
     * Store task method: Gets JSON;
     * parses the necessary data to create a new Task object and stores it in the DB with a generated ID
     * responses with JSON {"successful" : true} if the storage went good or {"successful" : false} if not
     * Tested with POSTMAN:
     * Example request:
     * POST http://localhost:9000/recording/task Headers Content-Type application/json Body {"timeSpent" : double, "date" : String, "notes" : String, "projectId" : int, "employeeId" : int} RESPONSE Body {"successful" : boolean}
     */


    public Result createPartner() {
        JsonNode json = request().body().asJson();
        String dateString = json.findPath("date").textValue();
        String notes = json.findPath("notes").textValue();
        Double timeSpent = json.findPath("timeSpent").doubleValue();
        Integer projectId = json.findPath("projectId").intValue();
        Integer employeeId = json.findPath("employeeId").intValue();

        if (timeSpent == null || dateString == null || notes == null || projectId == null || employeeId == null) {
            return badRequest("Missing parameter [time], [date], [notes], [projectId] or [employeeId]");
        } else {
            DatabaseService2.insertNewTask(timeSpent, dateString, notes, projectId, employeeId);
            ObjectNode result = Json.newObject();
            result.put("successful", true);
            return ok(result);
        }
    }


    private Result jsonResult(Result httpResponse) {
        httpResponse.as("application/json; charset=utf-8");
        return httpResponse;
    }

}