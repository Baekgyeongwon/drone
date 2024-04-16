package com.umc5th.dayrecord.repository;

import com.umc5th.dayrecord.domain.Diary;
import com.umc5th.dayrecord.domain.DroneLocation;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DroneLocationRepository extends JpaRepository<DroneLocation, Long> {

    // @Query("SELECT d FROM Diary d WHERE (d.user.id = :userId)")
    // Slice<Diary> findByUserId(@Param("userId") Long userId, PageRequest pageRequest);

}
