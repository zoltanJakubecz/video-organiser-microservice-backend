package com.jakuza.videoservice;

import com.jakuza.videoservice.model.Video;
import com.jakuza.videoservice.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final VideoRepository videoRepository;

    public DataInitializer(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Video video_first = Video.builder()
                .name("Video first")
                .url("https://www.youtube.com/watch?v=4JUkIM16_Ms&list=PL0JbT22qQL-OzeaukJH-QEUnd7JHteC7I&index=4")
                .build();
        Video video_second = Video.builder()
                .name("Video second")
                .url("https://www.youtube.com/watch?v=4JUkIM16_Ms&list=PL0JbT22qQL-OzeaukJH-QEUnd7JHteC7I&index=4")
                .build();
        Video video_third = Video.builder()
                .name("Video third")
                .url("https://www.youtube.com/watch?v=4JUkIM16_Ms&list=PL0JbT22qQL-OzeaukJH-QEUnd7JHteC7I&index=4")
                .build();

        videoRepository.save(video_first);
        videoRepository.save(video_second);
        videoRepository.save(video_third);

    }
}
