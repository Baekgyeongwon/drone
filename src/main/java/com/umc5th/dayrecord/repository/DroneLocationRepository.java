package com.umc5th.dayrecord.repository;

import com.umc5th.dayrecord.domain.DroneLocation;

import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DroneLocationRepository extends JpaRepository<DroneLocation, Long> {

    // @Query("SELECT d FROM Diary d WHERE (d.user.id = :userId)")
    // Slice<Diary> findByUserId(@Param("userId") Long userId, PageRequest pageRequest);
    Slice<DroneLocation> findOneByOrderByIdDesc();
}
