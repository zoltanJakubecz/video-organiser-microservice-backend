package com.jakuza.videoservice.service;

import com.jakuza.videoservice.model.RecommendCallResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
@Component
public class RecommendationServiceCaller {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @Value("${recommendation.url}")
    private String baseUrl;

    public List<RecommendCallResult> getRecommendationListByVideo(Long id){
        return Arrays.asList(Objects.requireNonNull(restTemplate.getForEntity(baseUrl + "/video/" + id, RecommendCallResult[].class).getBody()));
    }

    public RecommendCallResult createRecommendation(RecommendCallResult recommendCallResult){
        return restTemplate.postForObject(baseUrl, recommendCallResult, RecommendCallResult.class);
    }
}
