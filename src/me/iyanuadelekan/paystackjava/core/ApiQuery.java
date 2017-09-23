package me.iyanuadelekan.paystackjava.core;

import java.util.HashMap;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class ApiQuery {

    private HashMap<String, Object> queryMap;

    /**
     * Initializes a new query map
     */
    public ApiQuery() {
        this.queryMap = new HashMap<String, Object>();
    }

    /**
     * Used to add a parameter to the query map
     *
     * @param key
     * @param value
     */
    public void putParams(String key, Object value) {
        this.queryMap.put(key, value);
    }

    /**
     * Used to get all parameters within the query map
     *
     * @return - HashMap containin g query parameters
     */
    public HashMap<String, Object> getParams() {
        return this.queryMap;
    }

}
