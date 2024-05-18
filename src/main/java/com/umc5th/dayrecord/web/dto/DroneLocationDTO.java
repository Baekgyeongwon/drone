package com.umc5th.dayrecord.web.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class DroneLocationDTO {

    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DroneLocationResponseDTO {
        private Long id;
        //위도
        private double latitude;
        //경도
        private double longitude;
        //시작 = 1 , 종료 = 0
        private boolean isStart;
    }
}

