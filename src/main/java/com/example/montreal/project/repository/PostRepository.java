package com.example.montreal.project.repository;

import com.example.montreal.project.entity.Post;
import com.example.montreal.project.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
