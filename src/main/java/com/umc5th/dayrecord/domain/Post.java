package com.umc5th.dayrecord.domain;

import com.umc5th.dayrecord.domain.common.BaseEntity;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor 
@Entity
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    private String detail;

    public Post(String title, String detail){
        this.title = title;
        this.detail =detail;
    }

}
