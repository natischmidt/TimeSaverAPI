package com.example.clockbackend.Time;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@AllArgsConstructor

public class TimeService {

    TimeRepo timeRepo;

    public TimeEntity Save() {
        TimeEntity timeEntity = new TimeEntity(
                        UUID.randomUUID()
                );

        timeRepo.save(timeEntity);
        return timeEntity;
    }

    public List<TimeEntity> all() {
        return timeRepo.findAll();
    }


    //Map<Float, TimeEntity> times = new HashMap<>();

//    public TimeEntity save(TimeEntity timeEntity) {
//        times.put(timeEntity.getTime(), timeEntity);
//        return timeEntity;
//    }

//    public Optional<TimeEntity> get(String time) {
//        return Optional.ofNullable(times.get(time));
//    }
//
//    //public void delete(TimeEntity timeEntity) {
//        times.remove(timeEntity.getTime());
//    }

//    public void deleteTime(String id) {
//        TimeEntity timeEntity = timeRepo.get(id).orElseThrow();
//        timeRepo.delete(timeEntity);
//
//    }
}
