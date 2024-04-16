package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.domain.Diary;
import com.umc5th.dayrecord.domain.DroneLocation;

import java.util.List;

import org.springframework.data.domain.Slice;

public interface DroneLocationQueryService {


    DroneLocation save(float latitude,float longitude,boolean isStart);


}
