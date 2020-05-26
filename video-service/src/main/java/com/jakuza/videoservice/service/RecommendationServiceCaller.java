package com.jakuza.videoservice.service;

import com.jakuza.videoservice.model.RecommendCallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class RecommendationServiceCaller {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${recommendation.url}")
    private String baseUrl;

    public List<RecommendCallResult> getRecommendationListByVideo(Long id){
        return Arrays.asList(Objects.requireNonNull(restTemplate.getForEntity(baseUrl + "/" + id, RecommendCallResult[].class).getBody()));
    }

}
