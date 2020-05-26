package com.jakuza.recommendationservice;

import com.jakuza.recommendationservice.model.Recommendation;
import com.jakuza.recommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RecommendationRepository recommendationRepository;

    @Override
    public void run(String... args) {
        Recommendation recommendation1 = Recommendation.builder()
                .rating(3)
                .comment("Not 2 bad")
                .videoId(1L)
                .build();

        recommendationRepository.save(recommendation1);
    }
}
