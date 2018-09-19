package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.DatabaseService;



public class RegistrationController extends Controller {


    /**
     * Store task method: Gets JSON;
     * parses the necessary data to create a new Task object and stores it in the DB with a generated ID
     * responses with JSON {"successful" : true} if the storage went good or {"successful" : false} if not
     * Tested with POSTMAN:
     * Example request:
     * POST http://localhost:9000/register Headers Content-Type application/json Body {"name", "email" ,"password", "url" : int} RESPONSE Body {"successful" : boolean}
     */


    public Result createPartner() {
        JsonNode json = request().body().asJson();
        String name = json.findPath("name").textValue();
        String email = json.findPath("email").textValue();
        String password = json.findPath("password").textValue();
        String url = json.findPath("url").textValue();

        if (name == null || email == null || password == null || url == null) {
            return badRequest("Missing parameter");
        } else {
            DatabaseService.insertNewPartner(name, email, password, url);
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