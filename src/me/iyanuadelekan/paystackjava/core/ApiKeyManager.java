package me.iyanuadelekan.paystackjava.core;

/**
 * @author Iyanu Adelekan on 18/07/2016.
 */
class ApiKeyManager {

    private final String apiKey;

    ApiKeyManager() {
        this.apiKey = System.getenv("PAYSTACK_API_KEY");
    }

    /**
     * Gets Paystack API key
     * @return - API key
     */
    String getApiKey() {
        return apiKey;
    }

}
