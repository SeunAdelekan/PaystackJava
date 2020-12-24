package me.iyanuadelekan.paystackjava.core;

import me.iyanuadelekan.paystackjava.constants.Definitions;

import org.json.JSONObject;
import java.util.HashMap;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class Pages {

    private ApiConnection apiConnection;
    private ApiQuery apiQuery;

    /**
     * Used to create a new page
     *
     * @param queryMap
     * @return
     */
    public JSONObject createPage(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_CREATE_PAGE);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     * Used to create a new page
     *
     * @param query
     * @return
     */
    public JSONObject createPage(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_CREATE_PAGE);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     * Used to create a new page
     *
     * @param name
     * @param description
     * @param amount
     * @return
     */
    public JSONObject createPage(String name, String description, String amount) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_CREATE_PAGE);
        this.apiQuery = new ApiQuery();
        this.apiQuery.putParams("name", name);
        this.apiQuery.putParams("description", description);
        this.apiQuery.putParams("amount", amount);

        return this.apiConnection.connectAndQuery(this.apiQuery);
    }

    /**
     * Used to list created pages
     *
     * @param queryMap
     * @return
     */
    public JSONObject listPages(HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_LIST_PAGES);
        return this.apiConnection.connectAndQueryWithGet(queryMap);
    }

    /**
     * Used to list created pages
     *
     * @param query
     * @return
     */
    public JSONObject listPages(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_LIST_PAGES);
        return this.apiConnection.connectAndQueryWithGet(query);
    }

    /**
     * Used to list created pages
     *
     * @param perPage
     * @param page
     * @return
     */
    public JSONObject listPages(int perPage, int page) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_LIST_PAGES);
        this.apiQuery = new ApiQuery();
        this.apiQuery.putParams("perPage", perPage);
        this.apiQuery.putParams("page", page);

        return this.apiConnection.connectAndQueryWithGet(this.apiQuery);
    }

    /**
     * Used to fetch a page
     *
     * @param idOrSlug
     * @return
     */
    public JSONObject fetchPage(String idOrSlug) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_FETCH_PAGE + idOrSlug);
        return this.apiConnection.connectAndQueryWithGet();
    }

    /**
     * Used to update a page
     *
     * @param idOrSlug
     * @param queryMap
     * @return
     */
    public JSONObject updatePage(String idOrSlug, HashMap<String, Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_UPDATE_PAGE + idOrSlug);
        return this.apiConnection.connectAndQueryWithPut(queryMap);
    }

    /**
     * Used to update a page
     *
     * @param idOrSlug
     * @param query
     * @return
     */
    public JSONObject updatePage(String idOrSlug, ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_UPDATE_PAGE + idOrSlug);
        return this.apiConnection.connectAndQueryWithPut(query);
    }

    /**
     * Used to update a page
     *
     * @param idOrSlug
     * @param name
     * @param description
     * @param amount
     * @param active
     * @return
     */
    public JSONObject updatePage(String idOrSlug, String name, String description, String amount, boolean active) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_PAGES_UPDATE_PAGE + idOrSlug);
        this.apiQuery = new ApiQuery();
        this.apiQuery.putParams("name", name);
        this.apiQuery.putParams("description", description);
        this.apiQuery.putParams("amount", amount);
        this.apiQuery.putParams("active", active);

        return this.apiConnection.connectAndQueryWithPut(this.apiQuery);
    }

}
