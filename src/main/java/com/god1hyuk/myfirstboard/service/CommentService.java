package com.god1hyuk.myfirstboard.service;

import com.god1hyuk.myfirstboard.model.Comment;
import com.god1hyuk.myfirstboard.model.Post;
import com.god1hyuk.myfirstboard.repository.CommentRepository;
import com.god1hyuk.myfirstboard.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    // Get comments
    @Transactional
    public List<Comment> getComments(Long id) {
        Post post = postRepository.findById(id).orElseThrow(
                () -> new NullPointerException("게시물이 존재하지 않습니다.")
        );

        Comment comment = post.getC

        ArrayList<Comment> comments = new ArrayList<>();

        return null;
    }
}
