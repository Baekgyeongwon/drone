package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.domain.DroneLocation;


public interface DroneLocationQueryService {


    DroneLocation save_dl(double latitude, double longitude,boolean isStart);
    DroneLocation get_dl();

    
}
