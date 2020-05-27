package com.jakuza.recommendationservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Recommendation {

    @Id
    @GeneratedValue
    private Long id;

    private int rating;

    private String comment;

    private Long videoId;

    private LocalDateTime addedTime;

}
