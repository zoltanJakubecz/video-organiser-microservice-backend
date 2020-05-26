package com.jakuza.recommendationservice.controller;

import com.jakuza.recommendationservice.model.Recommendation;
import com.jakuza.recommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recom")
public class RecommendationController {

    @Autowired
    private RecommendationRepository recommendationRepository;

    @GetMapping("/{id}")
    public List<Recommendation> getRecommendationsByVideo(@PathVariable("id") Long videoId){
        return recommendationRepository.findAllByVideoIdEquals(videoId);
    }

}
