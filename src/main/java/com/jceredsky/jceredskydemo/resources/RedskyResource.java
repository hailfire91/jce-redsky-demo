package com.jceredsky.jceredskydemo.resources;

import com.jceredsky.jceredskydemo.models.RedskyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RedskyResource {

    private RestTemplate restTemplate;

    /**
     * returns a new instance of the object with the injected RestTemplate
     * @param restTemplate
     */
    public RedskyResource(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * returns the objects that the json was marshaled into.
     * @param id
     * @return
     */
    public RedskyResponse getRedskyProduct(String id)
    {
        String uri = "https://redsky.target.com/v2/pdp/tcin/" + id + "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";

        RedskyResponse response = restTemplate.getForObject(uri, RedskyResponse.class);

        return response;

    }

}
