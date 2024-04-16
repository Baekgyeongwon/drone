package com.umc5th.dayrecord.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Slice;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.umc5th.dayrecord.apiPayload.ApiResponse;
import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.domain.Post;
import com.umc5th.dayrecord.service.DiaryService.DroneLocationQueryService;
import com.umc5th.dayrecord.service.DiaryService.PostQueryService;
import com.umc5th.dayrecord.web.dto.DroneLocationDTO.DroneLocationResponseDTO;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Validated
@RequestMapping("/drone")
public class DroneController {
    
    private final DroneLocationQueryService droneLocationQueryService;
    private final PostQueryService postQueryService;
    
    @GetMapping("/post/new")
    public ApiResponse<Post> getPostCreate(
        @RequestParam(name = "title") String title,
        @RequestParam(name = "detail") String detail) {
        System.out.println("TEST");
        Post po =  postQueryService.save_post(title, detail);
        return ApiResponse.onSuccess(po);
    }


    @GetMapping("/post/last")
    public ApiResponse<List<Post> > getPostList() {
        List<Post> po =  postQueryService.get_posts();
        return ApiResponse.onSuccess(po);
    }

    @GetMapping("/location")
    public ApiResponse<DroneLocation>  putDroneLocation( 
        @RequestParam(name = "latitude") float latitude,
        @RequestParam(name = "longitude") float longitude,
        @RequestParam(name = "isStart") int isStart
        ) {
            System.out.println("TEST");
            DroneLocation dl =  droneLocationQueryService.save_dl(latitude, longitude, isStart==1);
        // System.out.println("userId"+ request.getUserId());
        return ApiResponse.onSuccess(dl);
    
    }
}
