package com.socialMedia.socialMedia.repositories;

import com.socialMedia.socialMedia.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
