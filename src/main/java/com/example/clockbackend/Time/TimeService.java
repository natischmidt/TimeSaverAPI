package com.example.clockbackend.Time;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class TimeService {

    TimeRepo timeRepo;


    public Stream<TimeEntity> all() {
        return timeRepo.all();
    }

    public void deleteTime(String id) {
        TimeEntity timeEntity = timeRepo.get(id).orElseThrow();
        timeRepo.delete(timeEntity);


    }
}
