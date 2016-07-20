import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Iyanu Adelekan on 17/07/2016.
 */
public class Customers {
    public Customers(){

    }
    private static ApiConnection apiConnection = null;
    /*
    The following set of methods aid the sending of API
    requests for the CREATION of customers
     */

    public JSONObject createCustomer(HashMap<String,Object> queryMap){
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject createCustomer(ApiQuery query) {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject createCustomer(String email, String firstName, String lastName,
                                     String phone, Object metadata){
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_CREATE_CUSTOMER);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("email",email);
        apiQuery.putParams("first_name",firstName);
        apiQuery.putParams("last_name",lastName);
        apiQuery.putParams("phone",phone);
        apiQuery.putParams("metadata",metadata);
        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aid the sending of API
    requests for the LISTING of customers
     */

    public JSONObject listCustomers(HashMap<String,Object> queryMap) {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);
        return apiConnection.connectAndQueryWithGet(queryMap);
    }

    public JSONObject listCustomers(ApiQuery query)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);
        return apiConnection.connectAndQueryWithGet(query);
    }

    public JSONObject listCustomers(int perPage, int page)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_LIST_CUSTOMERS);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("perPage",perPage);
        apiQuery.putParams("page",page);
        return apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /*
    The following set of methods aid the sending of API
    requests for the FETCHING of customers
     */

    public JSONObject fetchCustomer(String idOrCustomerCode)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_FETCH_CUSTOMER + idOrCustomerCode);
        return apiConnection.connectAndQueryWithGet();
    }

    /*
    The following set of methods aid the sending of API
    requests for the UPDATING of customers
     */

    public JSONObject updateCustomer(HashMap<String,Object> queryMap, String idOrCustomerCode)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);
        return apiConnection.connectAndQueryWithPut(queryMap);
    }

    public JSONObject updateCustomer(ApiQuery query, String idOrCustomerCode)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);
        return apiConnection.connectAndQueryWithPut(query);
    }

    public JSONObject updateCustomer(String idOrCustomerCode, String email, String firstName, String lastName,
                                     String phone, Object metadata)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER + idOrCustomerCode);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("first_name",firstName);
        apiQuery.putParams("last_name",lastName);
        apiQuery.putParams("phone",phone);
        apiQuery.putParams("metadata",metadata);
        return apiConnection.connectAndQueryWithPut(apiQuery);
    }
}
