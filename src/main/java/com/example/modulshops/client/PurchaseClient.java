/**
 * @author Vasilshift
 */
package com.example.modulshops.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class PurchaseClient {
    private final ClientConfig config;

    public void redirectToPurchase(long userId) {
        String url = String.format("http://host:port/purchase?userId=%s", userId);
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Object> entity = new HttpEntity("");
        restTemplate.exchange(url, HttpMethod.GET, entity, String.class, new Object[0]);
    }

    public PurchaseClient(final ClientConfig config) {
        this.config = config;
    }

}
