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

import com.umc5th.dayrecord.service.DiaryService.DiaryQueryService;
import com.umc5th.dayrecord.web.dto.DiaryDTO.diarySummaryListDTO; 

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
@Validated
@RequestMapping("/stream/private")
public class StreamPrivateController {
    
    private final DiaryQueryService diaryQueryService;
    
    @GetMapping("/daliyBoard/diary")
    public ApiResponse<diarySummaryListDTO> getDaliyBoardDiaryList() {

        return ApiResponse.onSuccess(new diarySummaryListDTO());
        
    }


    /**
     * post 수정 API
     * @param postId
     * @return ApiResponse
     */
    @PutMapping("/posts/{postId}")
    public ApiResponse<diarySummaryListDTO> changePost( @PathVariable(name = "postId") Long postId) {
        // System.out.println("userId"+ request.getUserId());
        return ApiResponse.onSuccess(new diarySummaryListDTO());
    
    }
}
