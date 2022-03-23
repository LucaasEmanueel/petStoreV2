package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class Utils {

    private static Response response;

    public static Response getResponse() {
        return response;
    }

    public static void setBaseUri(String uri){
        baseURI = uri;
    }

    public static String getBaseUri(){
        return baseURI;
    }


    public static Response post(Object corpo, String endpoint, ContentType type){
        return response = given()
                .relaxedHTTPSValidation()
                .log().all()
                .contentType(type)
                .body(corpo)
                .when().post(endpoint)
                .thenReturn();
    }

    public static Response put(Object corpo, String endpoint, ContentType type){
        return response = given()
                .relaxedHTTPSValidation()
                .log().all()
                .contentType(type)
                .body(corpo)
                .when().put(endpoint)
                .thenReturn();
    }
}
