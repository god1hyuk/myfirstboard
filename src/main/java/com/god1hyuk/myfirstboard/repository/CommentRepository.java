package com.god1hyuk.myfirstboard.repository;

import com.god1hyuk.myfirstboard.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
