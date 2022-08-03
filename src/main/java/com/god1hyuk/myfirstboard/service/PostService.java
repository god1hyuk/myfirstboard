package com.god1hyuk.myfirstboard.service;

import com.god1hyuk.myfirstboard.dto.PostRequestDto;
import com.god1hyuk.myfirstboard.model.Post;
import com.god1hyuk.myfirstboard.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    // Get a post
    public Post getPost(Long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 존재하지 않습니다.")
        );
        return post;
    }

    // Update a post
    @Transactional
    public Long updatePost(Long id, PostRequestDto requestDto) {
        this.getPost(id).updatePost(requestDto);
        return id;
    }

    // Delete a post
    @Transactional
    public Long deletePost(Long id) {
        postRepository.deleteById(id);
        return id;
    }
}
