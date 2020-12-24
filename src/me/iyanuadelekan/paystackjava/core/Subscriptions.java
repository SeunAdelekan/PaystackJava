package me.iyanuadelekan.paystackjava.core;

import me.iyanuadelekan.paystackjava.constants.Definitions;

import org.json.JSONObject;
import java.util.HashMap;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class Subscriptions {

    private ApiConnection apiConnection;
    private ApiQuery apiQuery;

    /**
     * Used to create a subscription
     *
     * @param queryMap
     * @return
     */
    public JSONObject createSubscription(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used to create a subscription
     *
     * @param query
     * @return
     */
    public JSONObject createSubscription(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used to create a subscription
     *
     * @param customer
     * @param plan
     * @param authorization
     * @return
     */
    public JSONObject createSubscription(String customer, String plan, String authorization) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION);
        this.apiQuery = new ApiQuery();

        this.apiQuery.putParams("customer", customer);
        this.apiQuery.putParams("plan", plan);
        this.apiQuery.putParams("authorization", authorization);

        return this.apiConnection.connectAndQuery(this.apiQuery);
    }

    /**
     * Used to disable a subscription
     *
     * @param queryMap
     * @return
     */
    public JSONObject disableSubscription(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used to disable a subscription
     *
     * @param query
     * @return
     */
    public JSONObject disableSubscription(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used to disable a subscription
     *
     * @param code
     * @param token
     * @return
     */
    public JSONObject disableSubscription(String code, String token) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION);
        this.apiQuery = new ApiQuery();

        this.apiQuery.putParams("code", code);
        this.apiQuery.putParams("token", token);

        return this.apiConnection.connectAndQuery(this.apiQuery);
    }

    /**
     * Used to enable a subscription
     *
     * @param queryMap
     * @return
     */
    public JSONObject enableSubscription(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used to enable a subscription
     *
     * @param query
     * @return
     */
    public JSONObject enableSubscription(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used to enable a subscription
     *
     * @param code
     * @param token
     * @return
     */
    public JSONObject enableSubscription(String code, String token) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION);
        this.apiQuery = new ApiQuery();

        this.apiQuery.putParams("code", code);
        this.apiQuery.putParams("token", token);

        return this.apiConnection.connectAndQuery(this.apiQuery);
    }

    /**
     * Used to fetch a subscription
     *
     * @param idOrSubscriptionCode
     * @return
     */
    public JSONObject fetchSubscription(String idOrSubscriptionCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_SUBSCRIPTIONS_FETCH_SUBSCRIPTION);
        return this.apiConnection.connectAndQueryWithGet();
    }

}
