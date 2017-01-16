package com.iyanu.paystackjava;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Iyanu on 17/07/2016.
 */
public class Pages {

    public Pages(){

    }

    private ApiConnection apiConnection = null;
    private ApiQuery apiQuery = null;

    /*
    The following set of methods aids the sending of API
    requests for the CREATION of pages
     */

    public JSONObject createPage(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_CREATE_PAGE);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject createPage(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_CREATE_PAGE);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject createPage(String name, String description, String amount)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_CREATE_PAGE);
        apiQuery = new ApiQuery();
        apiQuery.putParams("name", name);
        apiQuery.putParams("description", description);
        apiQuery.putParams("amount", amount);
        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the LISTING of pages
     */

    public JSONObject listPages(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_LIST_PAGES);
        return apiConnection.connectAndQueryWithGet(queryMap);
    }

    public JSONObject listPages(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_LIST_PAGES);
        return apiConnection.connectAndQueryWithGet(query);
    }

    public JSONObject listPages(int perPage, int page)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_LIST_PAGES);
        apiQuery = new ApiQuery();
        apiQuery.putParams("perPage", perPage);
        apiQuery.putParams("page", page);
        return apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the FETCHING of pages
     */

    public JSONObject fetchPage(String idOrSlug)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_FETCH_PAGE + idOrSlug);
        return apiConnection.connectAndQueryWithGet();
    }

    /*
    The following set of methods aids the sending of API
    requests for the UPDATING of pages
     */

    public JSONObject updatePage(String idOrSlug, HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_UPDATE_PAGE + idOrSlug);
        return apiConnection.connectAndQueryWithPut(queryMap);
    }

    public JSONObject updatePage(String idOrSlug, ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_UPDATE_PAGE + idOrSlug);
        return apiConnection.connectAndQueryWithPut(query);
    }

    public JSONObject updatePage(String idOrSlug, String name, String description, String amount, boolean active)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_UPDATE_PAGE + idOrSlug);
        apiQuery = new ApiQuery();
        apiQuery.putParams("name", name);
        apiQuery.putParams("description", description);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("active", active);
        return apiConnection.connectAndQueryWithPut(apiQuery);
    }

}
