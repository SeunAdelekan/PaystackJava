package com.iyanu.paystackjava;

import java.util.HashMap;

/**
 * Created by Iyanu on 17/07/2016.
 */
public class ApiQuery {
    public ApiQuery(){
        newQuery();
    }
    private HashMap<String,Object> queryMap = null;

    private void newQuery(){
        queryMap = new HashMap();
    }
    public void putParams(String key, Object value){
        queryMap.put(key,value);
    }
    public HashMap <String,Object> getParams(){
        return queryMap;
    }
}
