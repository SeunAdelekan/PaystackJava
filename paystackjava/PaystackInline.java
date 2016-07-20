import org.json.JSONObject;

import java.util.HashMap;

/**
 * Created by Iyanu Adelekan on 19/07/2016.
 */
public class PaystackInline {
    public PaystackInline(){

    }
    private static ApiConnection apiConnection = null;

    /*
    The following set of methods aids the sending of API
    requests for Paystack Standard
     */

    public JSONObject paystackStandard(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_PAYSTACK_STANDARD);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject paystackStandard(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_PAYSTACK_STANDARD);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject paystackStandard(String reference, int amount,
                                 String email, String plan, String callback_url)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_PAYSTACK_STANDARD);
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
    requests for  VERIFYING Paystack Standard transactions
     */

    public JSONObject verifyTransactions(String reference)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_VERIFY_TRANSACTIONS + reference);
        return apiConnection.connectAndQueryWithGet();
    }

    /*
    The following set of methods aids the sending of API
    requests for charging returning customers with Paystack Standard
     */

    public JSONObject chargeReturningCustomer(HashMap<String, Object> queryMap)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_CHARGE_AUTHORIZATION);
        return apiConnection.connectAndQuery(queryMap);
    }

    public JSONObject chargeReturningCustomer(ApiQuery query)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_CHARGE_AUTHORIZATION);
        return apiConnection.connectAndQuery(query);
    }

    public JSONObject chargeReturningCustomer(String authorization_code, String email,
                                              String amount, String reference)  {
        apiConnection = new ApiConnection(Definitions.PAYSTACK_INLINE_CHARGE_AUTHORIZATION);
        ApiQuery apiQuery = new ApiQuery();
        apiQuery.putParams("authorization_code", authorization_code);
        apiQuery.putParams("email", email);
        apiQuery.putParams("amount", amount);
        apiQuery.putParams("reference", reference);
        return apiConnection.connectAndQuery(apiQuery);
    }

}
