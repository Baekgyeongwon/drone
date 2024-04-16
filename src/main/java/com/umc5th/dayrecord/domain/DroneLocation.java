package com.umc5th.dayrecord.domain;

import com.umc5th.dayrecord.domain.common.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class DroneLocation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //위도
    private float latitude;
    //경도
    private float longitude;
    //시작 = 1 , 종료 = 0ㄴㄴ
    private boolean isStart;

    public DroneLocation(float latitude, float longitude, boolean isStart){
        this.latitude = latitude;
        this.longitude =longitude;
        this.isStart = isStart;
    }

}
