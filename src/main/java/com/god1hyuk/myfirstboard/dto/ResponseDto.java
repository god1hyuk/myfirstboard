package com.god1hyuk.myfirstboard.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class ResponseDto <T> {
    private boolean success;
    private T data;
    private String error;

    public ResponseDto(T data) {
        this.data = data;
    }
}
