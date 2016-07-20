import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.HashMap;

/**
 * Created by Iyanu Adelekan on 17/07/2016.
 */
public class Transactions {
    public Transactions() {

    }

    private static ApiConnection apiConnection = null;

    /*
    The following set of methods aids the sending of API
    requests for the INITIALIZATION of transactions
     */

    public JSONObject initializeTransaction(HashMap<String, Object> queryMap)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject initializeTransaction(ApiQuery query)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject initializeTransaction(String reference, String amount, String email,
                                            String plan, String callback_url)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("reference", reference);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("email", email);
        apiQuery.putParams("plan", plan);
        apiQuery.putParams("callback_url", callback_url);
        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the verification of transactions
     */

    public JSONObject verifyTransaction(String reference)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_VERIFY_TRANSACTION + reference);
        return apiConnection.connectAndQueryWithGet();
    }

    /*
    The following set of methods aids the sending of API
    requests for the LISTING of transactions
     */

    public JSONObject listTransactions(HashMap<String, Object> queryMap)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS);
        return apiConnection.connectAndQueryWithGet(queryMap);
    }

    public JSONObject listTransactions(ApiQuery query)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS);
        return apiConnection.connectAndQueryWithGet(query);
    }

    public JSONObject listTransactions(String perPage, String page)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("perPage", perPage);
        apiQuery.putParams("page", page);
        return apiConnection.connectAndQueryWithGet(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for the FETCHING of transactions
     */

    public JSONObject fetchTransaction(String id)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_FETCH_TRANSACTION + id);
        return apiConnection.connectAndQueryWithGet();
    }

    /*
    The following set of methods aids the sending of API
    requests for CHARGE AUTHORIZATION
     */

    public JSONObject chargeAuthorization(HashMap<String, Object> queryMap)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject chargeAuthorization(ApiQuery query)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject chargeAuthorization(String reference, String authorization_code, String amount,
                                            String email, String callback_url)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("reference", reference);
        apiQuery.putParams("authorization_code", authorization_code);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("email", email);
        apiQuery.putParams("callback_url", callback_url);

        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for CHARGE Token
     */

    public JSONObject chargeToken(HashMap<String, Object> queryMap)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_TOKEN);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject chargeToken(ApiQuery query)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_TOKEN);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject chargeToken(String reference, String token, String amount,
                                          String email)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_CHARGE_TOKEN);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("reference", reference);
        apiQuery.putParams("authorization_code", token);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("email", email);

        return apiConnection.connectAndQuery(apiQuery);
    }

    /*
    The following set of methods aids the sending of API
    requests for EXPORT TRANSACTIONS
     */

    public JSONObject exportTransactions(HashMap<String, Object> queryMap)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS);
        return apiConnection.connectAndQueryWithGet(queryMap);
    }

    public JSONObject exportTransactions(ApiQuery query)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS);
        return apiConnection.connectAndQueryWithGet(query);
    }

    public JSONObject exportTransactions(LocalDateTime from, LocalDateTime to, boolean settled,
                                         String payment_page)   {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("from", from);
        apiQuery.putParams("to", to);
        apiQuery.putParams("settled", settled);
        apiQuery.putParams("payment_page", payment_page);

        return apiConnection.connectAndQueryWithGet(apiQuery);
    }
}
