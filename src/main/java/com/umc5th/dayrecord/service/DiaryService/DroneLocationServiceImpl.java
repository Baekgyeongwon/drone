package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.repository.DroneLocationRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DroneLocationServiceImpl implements DroneLocationQueryService {

    private final DroneLocationRepository droneLocationRepository;

    @Override 
    public DroneLocation save_dl(float latitude,float longitude,boolean isStart) {
        DroneLocation dl = new DroneLocation(latitude, longitude, isStart);
        
        return droneLocationRepository.save(dl);
    }

    @Override
    public DroneLocation get_dl() {
        Slice<DroneLocation> droneLocationList= droneLocationRepository.findOneByOrderByIdDesc();

        return droneLocationList.toList().get(0);
    }
 
    
}
