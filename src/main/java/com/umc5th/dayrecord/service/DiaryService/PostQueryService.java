package com.umc5th.dayrecord.service.DiaryService;

import java.util.List;

import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.domain.Post;


public interface PostQueryService {


    Post save_post(String title, String detail);

    List<Post> get_posts();
}
