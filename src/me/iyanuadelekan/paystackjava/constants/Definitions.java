package me.iyanuadelekan.paystackjava.constants;

/**
 * @author Iyanu Adelekan on 17/07/2016.
 */
public class Definitions {

    /**
     * The following are URL definitions for the Paystack API. All URLs are
     * RESTful endpoints and as such modification of any of these URL resources
     * will lead to problems with querying the Paystack API. Only modify if you
     * know what you are doing.
     */
    private final static String BASE_API_ENDPOINT = "https://api.paystack.co";

    public static final String PAYSTACK_INLINE_PAYSTACK_STANDARD = BASE_API_ENDPOINT + "/transaction/initialize";
    public static final String PAYSTACK_INLINE_VERIFY_TRANSACTIONS = BASE_API_ENDPOINT + "/transaction/verify/";
    public static final String PAYSTACK_INLINE_CHARGE_AUTHORIZATION = BASE_API_ENDPOINT + "/transaction/charge_authorization";

    //URL definitions for customer endpoint
    public static final String PAYSTACK_CUSTOMERS_CREATE_CUSTOMER = BASE_API_ENDPOINT + "/customer";
    public static final String PAYSTACK_CUSTOMERS_LIST_CUSTOMERS = BASE_API_ENDPOINT + "/customer";
    public static final String PAYSTACK_CUSTOMERS_FETCH_CUSTOMER = BASE_API_ENDPOINT + "/customer/";
    public static final String PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER = BASE_API_ENDPOINT + "/customer/";

    //URL definitions for transaction endpoints
    public static final String PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION = BASE_API_ENDPOINT + "/transaction/initialize";
    public static final String PAYSTACK_TRANSACTIONS_VERIFY_TRANSACTION = BASE_API_ENDPOINT + "/transaction/verify/";
    public static final String PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS = BASE_API_ENDPOINT + "/transaction";
    public static final String PAYSTACK_TRANSACTIONS_FETCH_TRANSACTION = BASE_API_ENDPOINT + "/transaction/";
    public static final String PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION = BASE_API_ENDPOINT + "/transaction/charge_authorization";
    public static final String PAYSTACK_TRANSACTIONS_CHARGE_TOKEN = BASE_API_ENDPOINT + "/transaction/charge_token";
    public static final String PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS = BASE_API_ENDPOINT + "/transaction/export";

    //URL definitions for plan endpoint
    public static final String PAYSTACK_PLANS_CREATE_PLAN = BASE_API_ENDPOINT + "/plan";
    public static final String PAYSTACK_PLANS_LIST_PLANS = BASE_API_ENDPOINT + "/plan";
    public static final String PAYSTACK_PLANS_FETCH_PLAN = BASE_API_ENDPOINT + "/plan/";
    public static final String PAYSTACK_PLANS_UPDATE_PLAN = BASE_API_ENDPOINT + "/plan/";

    //URL definitions for subscription endpoints
    public static final String PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION = BASE_API_ENDPOINT + "/subscription";
    public static final String PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION = BASE_API_ENDPOINT + "/subscription/disable";
    public static final String PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION = BASE_API_ENDPOINT + "/subscription/enable";
    public static final String PAYSTACK_SUBSCRIPTIONS_FETCH_SUBSCRIPTION = BASE_API_ENDPOINT + "/subscription/";

    //URL definitions for page endpoint
    public static final String PAYSTACK_PAGES_CREATE_PAGE = BASE_API_ENDPOINT + "/page";
    public static final String PAYSTACK_PAGES_LIST_PAGES = BASE_API_ENDPOINT + "/page";
    public static final String PAYSTACK_PAGES_FETCH_PAGE = BASE_API_ENDPOINT + "/page/";
    public static final String PAYSTACK_PAGES_UPDATE_PAGE = BASE_API_ENDPOINT + "/page/";

}
