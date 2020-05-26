package com.jakuza.videoservice.repository;

import com.jakuza.videoservice.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
