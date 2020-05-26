package com.jakuza.recommendationservice.repository;

import com.jakuza.recommendationservice.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    List<Recommendation> findAllByVideoIdEquals(Long id);
}
