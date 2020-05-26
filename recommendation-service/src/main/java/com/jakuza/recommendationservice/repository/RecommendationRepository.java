package com.jakuza.recommendationservice.repository;

import com.jakuza.recommendationservice.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
}
