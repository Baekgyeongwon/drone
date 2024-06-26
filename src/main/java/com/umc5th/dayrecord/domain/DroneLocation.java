package com.umc5th.dayrecord.domain;

import com.umc5th.dayrecord.domain.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
public class DroneLocation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //위도
    private double latitude;
    //경도
    private double longitude;
    //시작 = 1 , 종료 = 0ㄴㄴ
    private boolean isStart;
    @Builder
    public DroneLocation(double latitude, double longitude, boolean isStart){
        this.latitude = latitude;
        this.longitude =longitude;
        this.isStart = isStart;
    }

}
