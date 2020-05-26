package com.jakuza.videoservice.controller;

import com.jakuza.videoservice.model.Video;
import com.jakuza.videoservice.model.VideoWithRecommendationsDTO;
import com.jakuza.videoservice.repository.VideoRepository;
import com.jakuza.videoservice.service.RecommendationServiceCaller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/videos")
@Slf4j
public class VideoController {

    private final VideoRepository videoRepository;

    private final RecommendationServiceCaller recommendationServiceCaller;

    public VideoController(VideoRepository videoRepository, RecommendationServiceCaller recommendationServiceCaller) {
        this.videoRepository = videoRepository;
        this.recommendationServiceCaller = recommendationServiceCaller;
    }

    @GetMapping
    public List<Video> getVideos(){
        return videoRepository.findAll();
    }

    @GetMapping("/{id}")
    public VideoWithRecommendationsDTO getRecommendationsByVideo(@PathVariable("id") Long videoId){
        return VideoWithRecommendationsDTO.builder()
                .video(videoRepository.getOne(videoId))
                .recommendCallResults(recommendationServiceCaller.getRecommendationListByVideo(videoId))
                .build();
    }

}
