package com.umc5th.dayrecord.repository;

import com.umc5th.dayrecord.domain.DroneLocation;
import com.umc5th.dayrecord.domain.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    // @Query("SELECT d FROM Diary d WHERE (d.user.id = :userId)")
    // Slice<Diary> findByUserId(@Param("userId") Long userId, PageRequest pageRequest);

}
