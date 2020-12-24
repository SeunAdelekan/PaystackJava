package me.iyanuadelekan.paystackjava.core;

import me.iyanuadelekan.paystackjava.constants.Definitions;

import org.json.JSONObject;
import java.util.HashMap;

/**
 * @author Iyanu Adelekan on 19/07/2016.
 */
public class PaystackInline {

    private ApiConnection apiConnection;

    /**
     *
     * @param queryMap
     * @return
     */
    public JSONObject paystackStandard(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_PAYSTACK_STANDARD);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     *
     * @param query
     * @return
     */
    public JSONObject paystackStandard(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_PAYSTACK_STANDARD);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     *
     * @param reference
     * @param amount
     * @param email
     * @param plan
     * @param callback_url
     * @return
     */
    public JSONObject paystackStandard(String reference, int amount, String email, String plan, String callback_url) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_PAYSTACK_STANDARD);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("reference", reference);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("email", email);
        apiQuery.putParams("plan", plan);
        apiQuery.putParams("callback_url", callback_url);

        return apiConnection.connectAndQuery(apiQuery);
    }

    /**
     *
     * @param reference
     * @return
     */
    public JSONObject verifyTransactions(String reference) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_VERIFY_TRANSACTIONS.concat(reference));
        return this.apiConnection.connectAndQueryWithGet();
    }

    /**
     *
     * @param queryMap
     * @return
     */
    public JSONObject chargeReturningCustomer(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_CHARGE_AUTHORIZATION);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     *
     * @param query
     * @return
     */
    public JSONObject chargeReturningCustomer(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_CHARGE_AUTHORIZATION);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     *
     * @param authorization_code
     * @param email
     * @param amount
     * @param reference
     * @return
     */
    public JSONObject chargeReturningCustomer(String authorization_code, String email, String amount, String reference) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_CHARGE_AUTHORIZATION);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("authorization_code", authorization_code);
        apiQuery.putParams("email", email);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("reference", reference);

        return this.apiConnection.connectAndQuery(apiQuery);
    }

}
