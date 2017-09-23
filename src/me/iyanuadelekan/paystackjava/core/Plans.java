package me.iyanuadelekan.paystackjava.core;

import me.iyanuadelekan.paystackjava.constants.Definitions;

import org.json.JSONObject;
import java.util.HashMap;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class Plans {

    private static ApiConnection apiConnection;

    /**
     * Used to create a plan
     *
     * @param queryMap
     * @return
     */
    public JSONObject createPlan(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_CREATE_PLAN);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used to create a plan
     *
     * @param query
     * @return
     */
    public JSONObject createPlan(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_CREATE_PLAN);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used to create a plan
     *
     * @param name
     * @param description
     * @param amount
     * @param interval
     * @param send_invoices
     * @param send_sms
     * @param currency
     * @return
     */
    public JSONObject createPlan(String name, String description, int amount, String interval,
            boolean send_invoices, boolean send_sms, String currency) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_CREATE_PLAN);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("name", name);
        apiQuery.putParams("description", description);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("send_invoices", send_invoices);
        apiQuery.putParams("send_sms", send_sms);
        apiQuery.putParams("currency", currency);

        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used to list plans
     *
     * @param queryMap
     * @return
     */
    public JSONObject listPlans(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_LIST_PLANS);
        return this.apiConnection.connectAndQueryWithGet(queryMap);
    }

    /**
     * Used to list plans
     *
     * @param query
     * @return
     */
    public JSONObject listPlans(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_LIST_PLANS);
        return this.apiConnection.connectAndQueryWithGet(query);
    }

    /**
     * Used to list plans
     *
     * @param perPage
     * @param page
     * @return
     */
    public JSONObject listPlans(String perPage, String page) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_LIST_PLANS);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("perPage", perPage);
        apiQuery.putParams("page", page);

        return this.apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /**
     * Used to fetch a plan
     *
     * @param idOrPlanCode
     * @return
     */
    public JSONObject fetchPlan(String idOrPlanCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_FETCH_PLAN + idOrPlanCode);
        return this.apiConnection.connectAndQueryWithGet();
    }

    /**
     * Used to update a plan
     *
     * @param idOrPlanCode
     * @param queryMap
     * @return
     */
    public JSONObject updatePlan(String idOrPlanCode, HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_UPDATE_PLAN + idOrPlanCode);
        return this.apiConnection.connectAndQueryWithPut(queryMap);
    }

    /**
     * Used to update a plan
     *
     * @param idOrPlanCode
     * @param query
     * @return
     */
    public JSONObject updatePlan(String idOrPlanCode, ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_UPDATE_PLAN.concat(idOrPlanCode));
        return this.apiConnection.connectAndQueryWithPut(query);
    }

    /**
     * Used to update a plan
     *
     * @param idOrPlanCode
     * @param name
     * @param description
     * @param amount
     * @param interval
     * @param send_invoices
     * @param send_sms
     * @param currency
     * @return
     */
    public JSONObject updatePlan(String idOrPlanCode, String name, String description, int amount,
            String interval, boolean send_invoices, String send_sms, String currency) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PLANS_UPDATE_PLAN.concat(idOrPlanCode));
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("name", name);
        apiQuery.putParams("description", description);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("interval", interval);
        apiQuery.putParams("send_invoices", send_invoices);
        apiQuery.putParams("send_sms", send_sms);
        apiQuery.putParams("currency", currency);

        return this.apiConnection.connectAndQueryWithPut(apiQuery);
    }

}
