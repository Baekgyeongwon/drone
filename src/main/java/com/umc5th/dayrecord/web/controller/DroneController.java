package com.umc5th.dayrecord.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Slice;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umc5th.dayrecord.apiPayload.ApiResponse;
import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.service.DiaryService.DroneLocationQueryService;
import com.umc5th.dayrecord.web.dto.DroneLocationDTO.DroneLocationResponseDTO;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Validated
@RequestMapping("/drone")
public class DroneController {
    
    private final DroneLocationQueryService droneLocationQueryService;
    
    @GetMapping("/post")
    public ApiResponse<DroneLocationResponseDTO> getDroneLocation() {

        return ApiResponse.onSuccess(new DroneLocationResponseDTO());
        
    }

    @PutMapping("/location")
    public ApiResponse<DroneLocation> changePost( 
        @PathVariable(name = "latitude") float latitude,
        @PathVariable(name = "longitude") float longitude,
        @PathVariable(name = "isStart") boolean isStart
        ) {
            DroneLocation dl =  droneLocationQueryService.save(latitude, longitude, isStart);
        // System.out.println("userId"+ request.getUserId());
        return ApiResponse.onSuccess(dl);
    
    }
}
