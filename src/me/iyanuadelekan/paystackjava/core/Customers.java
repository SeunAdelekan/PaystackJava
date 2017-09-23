package me.iyanuadelekan.paystackjava.core;

import me.iyanuadelekan.paystackjava.constants.Definitions;

import org.json.JSONObject;
import java.util.HashMap;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class Customers {

    private ApiConnection apiConnection;

    /**
     * Used to create a new customer
     *
     * @param queryMap
     * @return JSONObject
     */
    public JSONObject createCustomer(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used to create a new customer
     *
     * @param query
     * @return JSONObject
     */
    public JSONObject createCustomer(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used to create a new customer
     *
     * @param email
     * @param firstName
     * @param lastName
     * @param phone
     * @param metadata
     * @return JSONObject
     */
    public JSONObject createCustomer(String email, String firstName, String lastName,
            String phone, Object metadata) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("email", email);
        apiQuery.putParams("first_name", firstName);
        apiQuery.putParams("last_name", lastName);
        apiQuery.putParams("phone", phone);
        apiQuery.putParams("metadata", metadata);

        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     * Used to get a list of customers
     *
     * @param queryMap
     * @return JSONObject
     */
    public JSONObject listCustomers(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);
        return this.apiConnection.connectAndQueryWithGet(queryMap);
    }

    /**
     * Used to get a list of customers
     *
     * @param query
     * @return JSONObject
     */
    public JSONObject listCustomers(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);
        return this.apiConnection.connectAndQueryWithGet(query);
    }

    /**
     * Used to get a list of customers
     *
     * @param perPage
     * @param page
     * @return JSONObject
     */
    public JSONObject listCustomers(int perPage, int page) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);

        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("perPage", perPage);
        apiQuery.putParams("page", page);

        return this.apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /**
     * Used to get a customer
     *
     * @param idOrCustomerCode
     * @return JSONObject
     */
    public JSONObject fetchCustomer(String idOrCustomerCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_FETCH_CUSTOMER + idOrCustomerCode);
        return this.apiConnection.connectAndQueryWithGet();
    }

    /**
     * Used to update a customer
     *
     * @param queryMap
     * @param idOrCustomerCode
     * @return JSONObject
     */
    public JSONObject updateCustomer(HashMap<String, Object> queryMap, String idOrCustomerCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);
        return this.apiConnection.connectAndQueryWithPut(queryMap);
    }

    /**
     * Used to update a customer
     *
     * @param query
     * @param idOrCustomerCode
     * @return JSONObject
     */
    public JSONObject updateCustomer(ApiQuery query, String idOrCustomerCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);
        return this.apiConnection.connectAndQueryWithPut(query);
    }

    /**
     * Used to update a customer
     *
     * @param idOrCustomerCode
     * @param email
     * @param firstName
     * @param lastName
     * @param phone
     * @param metadata
     * @return JSONObject
     */
    public JSONObject updateCustomer(String idOrCustomerCode, String email, String firstName, String lastName,
            String phone, Object metadata) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER.concat(idOrCustomerCode));

        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("first_name", firstName);
        apiQuery.putParams("last_name", lastName);
        apiQuery.putParams("phone", phone);
        apiQuery.putParams("metadata", metadata);

        return this.apiConnection.connectAndQueryWithPut(apiQuery);
    }

}
