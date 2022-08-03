package com.god1hyuk.myfirstboard.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class CommentRequestDto {
    private final Long postId;
    private final String content;
}
