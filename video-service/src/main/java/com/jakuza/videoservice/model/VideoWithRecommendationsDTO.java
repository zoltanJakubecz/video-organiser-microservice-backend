package com.jakuza.videoservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VideoWithRecommendationsDTO {
    private Video video;
    private List<RecommendCallResult> recommendCallResults;
}
