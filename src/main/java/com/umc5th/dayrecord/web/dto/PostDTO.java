package com.umc5th.dayrecord.web.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class PostDTO {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostResponseDTO {
        
        private Long id;
        //위도
        private String title;
        //경도
        private String  detail;
    }
}

