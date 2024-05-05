package com.umc5th.dayrecord.service.DiaryService;

import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.domain.Post;
import com.umc5th.dayrecord.repository.DroneLocationRepository;
import com.umc5th.dayrecord.repository.PostRepository;

import lombok.RequiredArgsConstructor;


import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;

@Service
@RequiredArgsConstructor
public class PostQueryServiceImpl implements PostQueryService {

    private final PostRepository postRepository;

    public Post save_post(String title, String detail){
        Post po = new Post(title, detail);
        
        return postRepository.save(po);
    }
    public Post get_posts(){
        Slice<Post> poList = postRepository.findAllByOrderByIdDesc();
        return poList.toList().get(0);
    }
 
    
}
