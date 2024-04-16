package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.domain.DroneLocation;


public interface DroneLocationQueryService {


    DroneLocation save_dl(float latitude,float longitude,boolean isStart);


}
