package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.DatabaseService;


/**
 * Controller for the TimeRecording-requests (Employee-View).
 * 
 * TODO: Employee- Feature Team
 */
public class LoginController extends Controller {


    public Result authenticate(String email, String password) {
        JsonNode userPassword = Json.toJson(DatabaseService.authenticate(email));
        ObjectNode result = Json.newObject();
        ObjectNode payload = Json.newObject();
        payload.put("password", email);
        payload.set("email", userPassword);
        result.put("header", "email");
        result.set("payload", payload);
        return jsonResult(ok(result));
    }
    
    private Result jsonResult(Result httpResponse) {
        httpResponse.as("application/json; charset=utf-8");
        return httpResponse;
    }

}
