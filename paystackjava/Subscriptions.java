package com.iyanu.paystackjava;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Iyanu on 17/07/2016.
 */
public class Subscriptions {

    public Subscriptions(){

    }

    private ApiConnection apiConnection = null;
    private ApiQuery apiQuery = null;

    /*
    The following set of methods aids the sending of API
    requests for the CREATION of subscriptions
     */

    public JSONObject createSubscription(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject createSubscription(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject createSubscription(String customer, String plan, String authorization)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION);
        apiQuery = new ApiQuery();
        apiQuery.putParams("customer", customer);
        apiQuery.putParams("plan", plan);
        apiQuery.putParams("authorization", authorization);
        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the DISABLING of subscriptions
     */

    public JSONObject disableSubscription(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject disableSubscription(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject disableSubscription(String code, String token)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION);
        apiQuery = new ApiQuery();
        apiQuery.putParams("code", code);
        apiQuery.putParams("token", token);
        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the ENABLING of subscriptions
     */

    public JSONObject enableSubscription(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject enableSubscription(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject enableSubscription(String code, String token)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION);
        apiQuery = new ApiQuery();
        apiQuery.putParams("code", code);
        apiQuery.putParams("token", token);
        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the FETCHING of subscriptions
     */

    public JSONObject fetchSubscription(String idOrSubscriptionCode)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_FETCH_SUBSCRIPTION);
        return apiConnection.connectAndQueryWithGet();
    }
}
