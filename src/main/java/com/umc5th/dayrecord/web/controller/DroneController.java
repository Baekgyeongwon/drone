package com.umc5th.dayrecord.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Slice;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umc5th.dayrecord.apiPayload.ApiResponse;
import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.domain.Post;
import com.umc5th.dayrecord.service.DiaryService.DroneLocationQueryService;
import com.umc5th.dayrecord.service.DiaryService.PostQueryService;
import com.umc5th.dayrecord.web.dto.DroneLocationDTO.DroneLocationResponseDTO;
import com.umc5th.dayrecord.web.dto.PostDTO.PostResponseDTO;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Validated
@RequestMapping("/drone")
public class DroneController {
    
    private final DroneLocationQueryService droneLocationQueryService;
    private final PostQueryService postQueryService;
    
    @PostMapping("/post/new")
    public ApiResponse<Post> getPostCreate(
        @RequestParam(name = "title") String title,
        @RequestParam(name = "detail") String detail) {
        Post po =  postQueryService.save_post(title, detail);
        return ApiResponse.onSuccess(po);
    }


    @GetMapping("/post/last")
    public ApiResponse<Post> getPostList() {
        Post po =  postQueryService.get_posts();
        return ApiResponse.onSuccess(po);
    }

    @PostMapping("/location")
    public ApiResponse<DroneLocation>  putDroneLocation( 
        @RequestParam(name = "latitude") double latitude,
        @RequestParam(name = "longitude") double longitude,
        @RequestParam(name = "isStart") int isStart
        ) {
            DroneLocation dl =  droneLocationQueryService.save_dl(latitude, longitude, isStart==1);
        // System.out.println("userId"+ request.getUserId());
        return ApiResponse.onSuccess(dl);
    
    }
    @GetMapping("/location")
    public ApiResponse<DroneLocation>  getDroneLocation( 
        ) {
            DroneLocation dl =  droneLocationQueryService.get_dl();
        // System.out.println("userId"+ request.getUserId());
        return ApiResponse.onSuccess(dl);
    
    }
}
