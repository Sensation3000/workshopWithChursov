package controllers;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import models.User;

import static constants.CommonConstants.BASE_URL;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;


public class PetController {
   // private static final String BASE_URL = "https://petstore.swagger.io/v2/";
    private static final String PET_ENDPOINT = "pet";
    RequestSpecification requestSpecification;

    public PetController() {
        this.requestSpecification = given()
                .accept(JSON)
                .contentType(JSON)
                .baseUri(BASE_URL);
    }
}
