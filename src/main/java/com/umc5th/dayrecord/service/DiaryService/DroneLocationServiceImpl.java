package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.apiPayload.code.status.ErrorStatus;
import com.umc5th.dayrecord.apiPayload.exception.handler.DiaryHandler;
import com.umc5th.dayrecord.domain.Diary;
import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.repository.DiaryRepository;
import com.umc5th.dayrecord.repository.DroneLocationRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DroneLocationServiceImpl implements DroneLocationQueryService {

    private final DroneLocationRepository droneLocationRepository;

    @Override 
    public DroneLocation save(float latitude,float longitude,boolean isStart) {
        DroneLocation dl = new DroneLocation(latitude, longitude, isStart);
        
        return droneLocationRepository.save(dl);
    }
 
    
}
