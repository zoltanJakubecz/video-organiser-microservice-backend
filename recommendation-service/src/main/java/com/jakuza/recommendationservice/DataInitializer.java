package com.jakuza.recommendationservice;

import com.jakuza.recommendationservice.model.Recommendation;
import com.jakuza.recommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

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
                .addedTime(LocalDateTime.now())
                .build();

        recommendationRepository.save(recommendation1);
        Recommendation recommendation2 = Recommendation.builder()
                .rating(2)
                .comment("Not that bad")
                .videoId(1L)
                .addedTime(LocalDateTime.now())
                .build();

        recommendationRepository.save(recommendation2);
        Recommendation recommendation3 = Recommendation.builder()
                .rating(3)
                .comment("Not as bad as that")
                .videoId(2L)
                .addedTime(LocalDateTime.now())
                .build();

        recommendationRepository.save(recommendation3);
    }
}
