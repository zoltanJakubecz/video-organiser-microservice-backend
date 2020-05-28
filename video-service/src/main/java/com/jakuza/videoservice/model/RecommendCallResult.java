package com.jakuza.videoservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecommendCallResult {
    private Long id;
    private int rating;
    private String comment;
    private Long videoId;
    private LocalDateTime addedTime;
}
