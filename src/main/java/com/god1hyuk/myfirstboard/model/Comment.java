package com.god1hyuk.myfirstboard.model;

import com.god1hyuk.myfirstboard.dto.CommentRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Comment extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private Long postId;

    @Column(nullable = false)
    private String content;

    public Comment(CommentRequestDto requestDto) {
        this.author = "god1hyuk";
        this.postId = requestDto.getPostId();
        this.content = requestDto.getContent();
    }

//    public void updateComment(CommentRequestDto requestDto) {
//        this.author = requestDto.getAuthor();
//        this.content = requestDto.getContent();
//    }
}