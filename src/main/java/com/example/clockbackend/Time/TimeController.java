package com.example.clockbackend.Time;
import lombok.AllArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController


public class TimeController {

    TimeService timeService;

    //To get all the times saved
    @CrossOrigin
    @GetMapping("/times")
    public List<TimeEntity> all() {
        return new ArrayList<>(timeService.all());
    }


//    // to delete a time saved
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable("id") String id) {
//        timeService.deleteTime(id);
//        return ResponseEntity.ok().build();
//    }


    private static Time toDTO(TimeEntity timeEntity) {
        return new Time(timeEntity.getId(), timeEntity.getTime());
    }
}
