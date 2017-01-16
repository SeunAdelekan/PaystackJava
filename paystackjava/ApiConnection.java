package com.iyanu.paystackjava;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Iyanu on 17/07/2016.
 */
public class ApiConnection {
    
    private  String url;
    private String apiKey;
    
    public ApiConnection(String url) {
        this.url = url;
       
        this.apiKey = keys.KEY_IN_USE;
    }

    /*
    The following methods are used to send API POST REQUESTS
     */

    public JSONObject connectAndQuery(ApiQuery query) {
        try {
            HttpResponse<JsonNode> queryForResponse = Unirest.post(url)
                    .header("Accept","application/json")
                    .header("Authorization","Bearer "+apiKey)
                    .fields(query.getParams())
                    .asJson();
            return queryForResponse.getBody().getObject();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }


    public JSONObject connectAndQuery(HashMap<String,Object> query) {
        try {
            HttpResponse<JsonNode> queryForResponse = Unirest.post(url)
                    .header("Accept","application/json")
                    .header("Authorization","Bearer "+apiKey)
                    .fields(query)
                    .asJson();
            return queryForResponse.getBody().getObject();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    The following methods are used to send API GET REQUESTS
     */

    public JSONObject connectAndQueryWithGet(){
        try {
            HttpResponse<JsonNode> queryForResponse = Unirest.get(url)
                    .header("Accept","application/json")
                    .header("Authorization","Bearer "+apiKey)
                    .asJson();
            return queryForResponse.getBody().getObject();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONObject connectAndQueryWithGet(ApiQuery query){
        try {
            HttpResponse<JsonNode> queryForResponse = Unirest.get(url)
                    .header("Accept","application/json")
                    .header("Authorization","Bearer "+apiKey)
                    .queryString(query.getParams())
                    .asJson();
            return queryForResponse.getBody().getObject();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONObject connectAndQueryWithGet(HashMap<String,Object> query) {
        try {
            HttpResponse<JsonNode> queryForResponse = Unirest.get(url)
                    .header("Accept","application/json")
                    .header("Authorization","Bearer "+apiKey)
                    .queryString(query)
                    .asJson();
            return queryForResponse.getBody().getObject();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    The following methods are used to send API PUT REQUESTS
     */

    public JSONObject connectAndQueryWithPut(ApiQuery query) {
        try {
            HttpResponse<JsonNode> queryForResponse = Unirest.put(url)
                    .header("Accept","application/json")
                    .header("Authorization","Bearer "+apiKey)
                    .fields(query.getParams())
                    .asJson();
            return queryForResponse.getBody().getObject();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JSONObject connectAndQueryWithPut(HashMap<String,Object> query) {
        try {
            HttpResponse<JsonNode> queryForResponse = Unirest.get(url)
                    .header("Accept","application/json")
                    .header("Authorization","Bearer "+apiKey)
                    .queryString(query)
                    .asJson();
            return queryForResponse.getBody().getObject();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void shutDown() {
        try {
            Unirest.shutdown();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
