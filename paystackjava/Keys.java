package com.iyanu.paystackjava;

import org.json.JSONObject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Iyanu on 18/07/2016.
 */
public class Keys {
    public Keys(){

    }

    private JSONObject jsonObject;
    private String fileContent="";

    //Keys
    String TEST_SECRET_KEY;
    String TEST_PUBLIC_KEY;
    String LIVE_SECRET_KEY;
    String LIVE_PUBLIC_KEY;
    String KEY_IN_USE;

    public void initKeys() throws FileNotFoundException {
        fileContent="";
        File file = new File("Keys.json");
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNext()){
            fileContent += scanner.nextLine();
        }
        
        jsonObject = new JSONObject(fileContent);
        jsonObject = jsonObject.getJSONObject("API_KEYS");
        KEY_IN_USE = jsonObject.getString("KEY_IN_USE");
        TEST_SECRET_KEY = jsonObject.getString("TEST_SECRET_KEY");
        TEST_PUBLIC_KEY = jsonObject.getString("TEST_PUBLIC_KEY");
        LIVE_SECRET_KEY = jsonObject.getString("LIVE_SECRET_KEY");
        LIVE_PUBLIC_KEY = jsonObject.getString("LIVE_PUBLIC_KEY");
    }

    protected String getTEST_SECRET_KEY(){
        return TEST_SECRET_KEY;
    }

    protected void setTest_SECRET_KEY(String key){
        TEST_SECRET_KEY = key;
    }
    protected String getTEST_PUBLIC_KEY(){
        return TEST_PUBLIC_KEY;
    }

    protected void setTEST_PUBLIC_KEY(String key){
        TEST_PUBLIC_KEY = key;
    }
    protected String getLIVE_SECRET_KEY(){
        return LIVE_SECRET_KEY;
    }

    protected void setLIVE_SECRET_KEY(String key){
        LIVE_SECRET_KEY = key;
    }
    protected String getLIVE_PUBLIC_KEY(){
        return LIVE_PUBLIC_KEY;
    }

    protected void setLIVE_PUBLIC_KEY(String key){
        LIVE_PUBLIC_KEY = key;
    }
}
