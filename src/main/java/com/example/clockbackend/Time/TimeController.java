package com.example.clockbackend.Time;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/api/times")

public class TimeController {

    TimeService timeService;

    //To get all the times saved
    @GetMapping
    public List<Time> all() {
        return timeService.all()
                .map(TimeController::toDTO)
                .collect(Collectors.toList());
    }


    // to delete a time saved
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
        timeService.deleteTime(id);
        return ResponseEntity.ok().build();
    }


    private static Time toDTO(TimeEntity timeEntity) {
        return new Time(timeEntity.getId(), timeEntity.getTime());
    }
}
