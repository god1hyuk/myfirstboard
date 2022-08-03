package com.god1hyuk.myfirstboard.repository;

import com.god1hyuk.myfirstboard.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByModifiedAtDesc();
}
