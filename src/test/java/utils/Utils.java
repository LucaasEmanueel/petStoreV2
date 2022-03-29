package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

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

    public static Response get(String endpoint, ContentType type, Map<String, Object> params){
        return response = given()
                .relaxedHTTPSValidation()
                .contentType(type)
                .params(params)
                .log().all()
                .when().get(endpoint)
                .thenReturn();
    }

    public static Response delete(String endpoint, ContentType type){
        return response = given()
                .relaxedHTTPSValidation()
                .contentType(type)
                .log().all()
                .when().delete(endpoint)
                .thenReturn();
    }
}
