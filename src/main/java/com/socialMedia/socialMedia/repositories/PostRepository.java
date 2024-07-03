package com.socialMedia.socialMedia.repositories;

import com.socialMedia.socialMedia.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
