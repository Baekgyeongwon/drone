package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.domain.Diary;

import java.util.List;

import org.springframework.data.domain.Slice;

public interface DiaryQueryService {

    Diary findDiary(Long streamId);


    boolean existById(Long value);


}
