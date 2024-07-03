package com.socialMedia.socialMedia.repositories;

import com.socialMedia.socialMedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
