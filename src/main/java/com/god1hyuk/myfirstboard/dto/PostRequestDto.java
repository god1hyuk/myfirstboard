package com.god1hyuk.myfirstboard.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PostRequestDto {
    private final String title;
    private final String content;
}
