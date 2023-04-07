package com.example.clockbackend.Time;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@Component
public class TimeRepo {

    Map<Float, TimeEntity> times = new HashMap<>();

    public Stream<TimeEntity> all() {
        return times.values().stream();
    }

    public TimeEntity save(TimeEntity timeEntity) {
        times.put(timeEntity.getTime(), timeEntity);
        return timeEntity;
    }

    public Optional<TimeEntity> get(String time) {
        return Optional.ofNullable(times.get(time));
    }

    public void delete(TimeEntity timeEntity) {
        times.remove(timeEntity.getTime());
    }
}