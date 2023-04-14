package com.example.clockbackend.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TimeRepo extends JpaRepository<TimeEntity, String> {


}