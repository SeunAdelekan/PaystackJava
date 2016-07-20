/**
 * Created by Iyanu on 17/07/2016.
 */
class Definitions {
    //URL definitions for Paystack
    
    final static String BASE_API_ENDPOINT = "https://api.paystack.co";

    public static final String PAYSTACK_INLINE_PAYSTACK_STANDARD = BASE_API_ENDPOINT+"/transaction/initialize";
    public static final String PAYSTACK_INLINE_VERIFY_TRANSACTIONS = BASE_API_ENDPOINT+"/transaction/verify/";
    public static final String PAYSTACK_INLINE_CHARGE_AUTHORIZATION = BASE_API_ENDPOINT+"/transaction/charge_authorization";

    //URL definitions for customers
    public static final String PAYSTACK_CUSTOMERS_CREATE_CUSTOMER = BASE_API_ENDPOINT+"/customer";
    public static final String PAYSTACK_CUSTOMERS_LIST_CUSTOMERS = BASE_API_ENDPOINT+"/customer";
    public static final String PAYSTACK_CUSTOMERS_FETCH_CUSTOMER = BASE_API_ENDPOINT+"/customer/";
    public static final String PAYSTACK_CUSTOMERS_UPDATE_CUSTOMER = BASE_API_ENDPOINT+"/customer/";

    //URL definitions for transactions
    public static final String PAYSTACK_TRANSACTIONS_INITIALIZE_TRANSACTION = BASE_API_ENDPOINT+"/transaction/initialize";
    public static final String PAYSTACK_TRANSACTIONS_VERIFY_TRANSACTION = BASE_API_ENDPOINT+"/transaction/verify/";
    public static final String PAYSTACK_TRANSACTIONS_LIST_TRANSACTIONS = BASE_API_ENDPOINT+"/transaction";
    public static final String PAYSTACK_TRANSACTIONS_FETCH_TRANSACTION = BASE_API_ENDPOINT+"/transaction/";
    public static final String PAYSTACK_TRANSACTIONS_CHARGE_AUTHORIZATION = BASE_API_ENDPOINT+"/transaction/charge_authorization";
    public static final String PAYSTACK_TRANSACTIONS_CHARGE_TOKEN = BASE_API_ENDPOINT+"/transaction/charge_token";
    public static final String PAYSTACK_TRANSACTIONS_EXPORT_TRANSACTIONS = BASE_API_ENDPOINT+"/transaction/export";

    //URL definitions for plans
    public static final String PAYSTACK_PLANS_CREATE_PLAN = BASE_API_ENDPOINT+"/plan";
    public static final String PAYSTACK_PLANS_LIST_PLANS = BASE_API_ENDPOINT+"/plan";
    public static final String PAYSTACK_PLANS_FETCH_PLAN = BASE_API_ENDPOINT+"/plan/";
    public static final String PAYSTACK_PLANS_UPDATE_PLAN = BASE_API_ENDPOINT+"/plan/";

    //URL definitions for subscriptions
    public static final String PAYSTACK_SUBSCRIPTIONS_CREATE_SUBSCRIPTION = BASE_API_ENDPOINT+"/subscription";
    public static final String PAYSTACK_SUBSCRIPTIONS_DISABLE_SUBSCRIPTION = BASE_API_ENDPOINT+"/subscription/disable";
    public static final String PAYSTACK_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION = BASE_API_ENDPOINT+"/subscription/enable";
    public static final String PAYSTACK_SUBSCRIPTIONS_FETCH_SUBSCRIPTION = BASE_API_ENDPOINT+"/subscription/";

    //URL definitions for pages
    public static final String PAYSTACK_PAGES_CREATE_PAGE = BASE_API_ENDPOINT+"/page";
    public static final String PAYSTACK_PAGES_LIST_PAGES = BASE_API_ENDPOINT+"/page";
    public static final String PAYSTACK_PAGES_FETCH_PAGE = BASE_API_ENDPOINT+"/page/";
    public static final String PAYSTACK_PAGES_UPDATE_PAGE = BASE_API_ENDPOINT+"/page/";
}
