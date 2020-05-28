package com.jakuza.recommendationservice.controller;

import com.jakuza.recommendationservice.model.Recommendation;
import com.jakuza.recommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/recom")
public class RecommendationController {

    @Autowired
    private RecommendationRepository recommendationRepository;

    @PostMapping
    public Recommendation add(@RequestBody Recommendation recommendation){
        recommendation.setAddedTime(LocalDateTime.now());
        return recommendationRepository.save(recommendation);
    }

    @GetMapping("/video/{id}")
    public List<Recommendation> getRecommendationsByVideo(@PathVariable("id") Long videoId){
        return recommendationRepository.findAllByVideoIdEquals(videoId);
    }

}
