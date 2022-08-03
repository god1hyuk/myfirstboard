package com.god1hyuk.myfirstboard.controller;

import com.god1hyuk.myfirstboard.dto.CommentRequestDto;
import com.god1hyuk.myfirstboard.model.Comment;
import com.god1hyuk.myfirstboard.repository.CommentRepository;
import com.god1hyuk.myfirstboard.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentRepository commentRepository;
    private final CommentService commentService;

    // Get comments per one post
    @GetMapping("/api/comment/{id}")
    public List<Comment> getComments(@PathVariable Long id) {
        commentService.getComments(id);
        return null;
    }

    @PostMapping("/api/auth/comment")
    public Comment createComment(@RequestBody CommentRequestDto requestDto) {
        return commentRepository.save(new Comment(requestDto));
    }

}
