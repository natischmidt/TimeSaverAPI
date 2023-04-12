package com.example.clockbackend.Time;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;


public interface TimeRepo extends JpaRepository<TimeEntity, String> {


}