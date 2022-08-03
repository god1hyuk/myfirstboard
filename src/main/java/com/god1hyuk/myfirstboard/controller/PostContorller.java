package com.god1hyuk.myfirstboard.controller;

import com.god1hyuk.myfirstboard.dto.PostRequestDto;
import com.god1hyuk.myfirstboard.model.Post;
import com.god1hyuk.myfirstboard.repository.PostRepository;
import com.god1hyuk.myfirstboard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostContorller {
    private final PostRepository postRepository;
    private final PostService postService;

    // Get all posts
    @GetMapping("/api/post")
    public List<Post> getAllPosts() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }

    // Get a post
    @GetMapping("/api/post/{id}")
    public Post getPost(@PathVariable Long id) {
        return postService.getPost(id);
    }

    // Create a post
    @PostMapping("/api/auth/post")
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        return postRepository.save(new Post(requestDto));
    }

    // Update a post
    @PutMapping("/api/auth/post/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.updatePost(id, requestDto);
    }

    // Delete a post
    @DeleteMapping("/api/auth/post/{id}")
    public Long deletePost(@PathVariable Long id) {
        return postService.deletePost(id);
    }
}
