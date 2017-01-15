package com.iyanu.paystackjava;

import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Iyanu Adelekan on 17/07/2016.
 */
public class Plans {

    public Plans(){

    }
    private static ApiConnection apiConnection = null;

    /*
    The following set of methods aids the sending of API
    requests for the CREATION of PLANS
     */

    public JSONObject createPlan(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_CREATE_PLAN);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject createPlan(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_CREATE_PLAN);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject createPlan(String name, String description, int amount, String interval,
                                            boolean send_invoices, boolean send_sms, String currency)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_CREATE_PLAN);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("name", name);
        apiQuery.putParams("description", description);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("send_invoices", send_invoices);
        apiQuery.putParams("send_sms", send_sms);
        apiQuery.putParams("currency", currency);
        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the LIST of PLANS
     */

    public JSONObject listPlans(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_LIST_PLANS);
        return apiConnection.connectAndQueryWithGet(queryMap);
    }

    public JSONObject listPlans(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_LIST_PLANS);
        return apiConnection.connectAndQueryWithGet(query);
    }

    public JSONObject listPlans(String perPage, String page)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_LIST_PLANS);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("perPage", perPage);
        apiQuery.putParams("page", page);
        return apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /*
    The following method aids the sending of API
    requests for the FETCHING of a PLAN
     */

    public JSONObject fetchPlan(String idOrPlanCode)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_FETCH_PLAN + idOrPlanCode);
        return apiConnection.connectAndQueryWithGet();
    }

    /*
    The following set of methods aids the sending of API
    requests for the UPDATING of a PLAN
     */

    public JSONObject updatePlan(String idOrPlanCode, HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_UPDATE_PLAN + idOrPlanCode);
        return apiConnection.connectAndQueryWithPut(queryMap);
    }

    public JSONObject updatePlan(String idOrPlanCode, ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_UPDATE_PLAN + idOrPlanCode);
        return apiConnection.connectAndQueryWithPut(query);
    }

    public JSONObject updatePlan(String idOrPlanCode, String name, String description, int amount,
                                 String interval, boolean send_invoices, String send_sms, String currency)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_UPDATE_PLAN + idOrPlanCode);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("name", name);
        apiQuery.putParams("description", description);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("interval", interval);
        apiQuery.putParams("send_invoices", send_invoices);
        apiQuery.putParams("send_sms", send_sms);
        apiQuery.putParams("currency", currency);
        return apiConnection.connectAndQueryWithPut(apiQuery);
    }
}
