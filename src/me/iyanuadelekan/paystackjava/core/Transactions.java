package me.iyanuadelekan.paystackjava.core;

import me.iyanuadelekan.paystackjava.constants.Definitions;

import org.json.JSONObject;
import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class Transactions {

    private ApiConnection apiConnection;

    /**
     * Used to initialize a transaction
     *
     * @param queryMap
     * @return
     */
    public JSONObject initializeTransaction(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used to initialize a transaction
     *
     * @param query
     * @return
     */
    public JSONObject initializeTransaction(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used to initialize a transaction
     *
     * @param reference
     * @param amount
     * @param email
     * @param plan
     * @param callback_url
     * @return
     */
    public JSONObject initializeTransaction(String reference, String amount, String email,
            String plan, String callback_url) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("reference", reference);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("email", email);
        apiQuery.putParams("plan", plan);
        apiQuery.putParams("callback_url", callback_url);
        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used to verify a transaction
     *
     * @param reference
     * @return
     */
    public JSONObject verifyTransaction(String reference) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_VERIFY_TRANSACTION + reference);
        return this.apiConnection.connectAndQueryWithGet();
    }

    /**
     * Used to list transactions
     *
     * @param queryMap
     * @return
     */
    public JSONObject listTransactions(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS);
        return this.apiConnection.connectAndQueryWithGet(queryMap);
    }

    /**
     * Used to list transactions
     *
     * @param query
     * @return
     */
    public JSONObject listTransactions(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS);
        return this.apiConnection.connectAndQueryWithGet(query);
    }

    /**
     * Used to list transactions
     *
     * @param perPage
     * @param page
     * @return
     */
    public JSONObject listTransactions(String perPage, String page) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("perPage", perPage);
        apiQuery.putParams("page", page);
        return this.apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /**
     * Used to fetch transactions
     *
     * @param id
     * @return
     */
    public JSONObject fetchTransaction(String id) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_FETCH_TRANSACTION + id);
        return this.apiConnection.connectAndQueryWithGet();
    }

    /**
     * Used for charge authorization
     *
     * @param queryMap
     * @return
     */
    public JSONObject chargeAuthorization(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used for charge authorization
     *
     * @param query
     * @return
     */
    public JSONObject chargeAuthorization(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used for charge authorization
     *
     * @param reference
     * @param authorization_code
     * @param amount
     * @param email
     * @param callback_url
     * @return
     */
    public JSONObject chargeAuthorization(String reference, String authorization_code, String amount,
            String email, String callback_url) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("reference", reference);
        apiQuery.putParams("authorization_code", authorization_code);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("email", email);
        apiQuery.putParams("callback_url", callback_url);

        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used for charge token
     *
     * @param queryMap
     * @return
     */
    public JSONObject chargeToken(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_TOKEN);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used for charge token
     *
     * @param query
     * @return
     */
    public JSONObject chargeToken(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_TOKEN);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used for charge token
     *
     * @param reference
     * @param token
     * @param amount
     * @param email
     * @return
     */
    public JSONObject chargeToken(String reference, String token, String amount, String email) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_TOKEN);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("reference", reference);
        apiQuery.putParams("authorization_code", token);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("email", email);

        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used to export transactions
     *
     * @param queryMap
     * @return
     */
    public JSONObject exportTransactions(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS);
        return this.apiConnection.connectAndQueryWithGet(queryMap);
    }

    /**
     * Used to export transactions
     *
     * @param query
     * @return
     */
    public JSONObject exportTransactions(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS);
        return this.apiConnection.connectAndQueryWithGet(query);
    }

    /**
     * Used to export transactions
     *
     * @param from
     * @param to
     * @param settled
     * @param payment_page
     * @return
     */
    public JSONObject exportTransactions(LocalDateTime from, LocalDateTime to, boolean settled, String payment_page) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("from", from);
        apiQuery.putParams("to", to);
        apiQuery.putParams("settled", settled);
        apiQuery.putParams("payment_page", payment_page);

        return this.apiConnection.connectAndQueryWithGet(apiQuery);
    }

}
