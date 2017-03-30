import org.json.JSONObject;
import java.util.HashMap;

/**
 * Created by Iyanu Adelekan on 17/07/2016.
 */
public class Customers {

    private ApiConnection apiConnection;

    /**
     *
     * @param queryMap
     * @return
     */
    public JSONObject createCustomer(HashMap<String,Object> queryMap){
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        return this.apiConnection.connectAndQuery(queryMap);
    }

    /**
     *
     * @param query
     * @return
     */
    public JSONObject createCustomer(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        return this.apiConnection.connectAndQuery(query);
    }

    /**
     *
     * @param email
     * @param firstName
     * @param lastName
     * @param phone
     * @param metadata
     * @return
     */
    public JSONObject createCustomer(String email, String firstName, String lastName,
                                     String phone, Object metadata) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        ApiQuery apiQuery = new ApiQuery();

        apiQuery.putParams("email",email);
        apiQuery.putParams("first_name",firstName);
        apiQuery.putParams("last_name",lastName);
        apiQuery.putParams("phone",phone);
        apiQuery.putParams("metadata",metadata);

        return this.apiConnection.connectAndQuery(apiQuery);
    }

    /**
     *
     * @param queryMap
     * @return
     */
    public JSONObject listCustomers(HashMap<String,Object> queryMap) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);
        return this.apiConnection.connectAndQueryWithGet(queryMap);
    }

    /**
     *
     * @param query
     * @return
     */
    public JSONObject listCustomers(ApiQuery query) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);
        return this.apiConnection.connectAndQueryWithGet(query);
    }

    /**
     *
     * @param perPage
     * @param page
     * @return
     */
    public JSONObject listCustomers(int perPage, int page) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);

        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("perPage",perPage);
        apiQuery.putParams("page",page);

        return this.apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /**
     *
     * @param idOrCustomerCode
     * @return
     */
    public JSONObject fetchCustomer(String idOrCustomerCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_FETCH_CUSTOMER + idOrCustomerCode);
        return this.apiConnection.connectAndQueryWithGet();
    }

    /**
     *
     * @param queryMap
     * @param idOrCustomerCode
     * @return
     */
    public JSONObject updateCustomer(HashMap<String,Object> queryMap, String idOrCustomerCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);
        return this.apiConnection.connectAndQueryWithPut(queryMap);
    }

    /**
     *
     * @param query
     * @param idOrCustomerCode
     * @return
     */
    public JSONObject updateCustomer(ApiQuery query, String idOrCustomerCode) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);
        return this.apiConnection.connectAndQueryWithPut(query);
    }

    /**
     *
     * @param idOrCustomerCode
     * @param email
     * @param firstName
     * @param lastName
     * @param phone
     * @param metadata
     * @return
     */
    public JSONObject updateCustomer(String idOrCustomerCode, String email, String firstName, String lastName,
                                     String phone, Object metadata) {
        this.apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);

        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("first_name",firstName);
        apiQuery.putParams("last_name",lastName);
        apiQuery.putParams("phone",phone);
        apiQuery.putParams("metadata",metadata);

        return this.apiConnection.connectAndQueryWithPut(apiQuery);
    }

}
