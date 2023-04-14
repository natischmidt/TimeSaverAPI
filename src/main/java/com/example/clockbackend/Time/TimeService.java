package com.example.clockbackend.Time;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import java.util.*;


@Service
public class TimeService {

    TimeRepo timeRepo;

    public TimeService(TimeRepo timeRepo){
        this.timeRepo = timeRepo;
    }

    public Optional<TimeEntity> Save(DTO dto) {
        TimeEntity timeEntity = new TimeEntity(
                        UUID.randomUUID(),
                        dto.time()
                );
        timeRepo.save(timeEntity);
        return Optional.of(timeEntity);
    }

    public List<TimeEntity> all() {
        return timeRepo.findAll();
    }


}
