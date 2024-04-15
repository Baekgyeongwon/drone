package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.apiPayload.code.status.ErrorStatus;
import com.umc5th.dayrecord.apiPayload.exception.handler.DiaryHandler;
import com.umc5th.dayrecord.domain.Diary;
import com.umc5th.dayrecord.repository.DiaryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DiaryQueryServiceImpl implements DiaryQueryService {

    private final DiaryRepository diaryRepository;

    @Override
    public boolean existById(Long diaryId) {
        return diaryRepository.existsById(diaryId);
    }


    @Override
    public Diary findDiary(Long streamId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findDiary'");
    }
    
}
