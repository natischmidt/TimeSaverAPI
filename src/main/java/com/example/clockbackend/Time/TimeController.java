package com.example.clockbackend.Time;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/timer")
public class TimeController {

    TimeService timeService;

    //To save times
    @CrossOrigin
    @PostMapping()
    public DTO Saved(@RequestBody DTO dto) {
        return timeService.Save(dto)
                .map(TimeController::timesdto)
                .orElse(null);
    }

    //To get all the times saved

    @CrossOrigin
    @GetMapping()
    public List<DTO> GetTimes() {
        return timeService.all()
                .stream()
                .map(TimeController::timesdto)
                .collect(Collectors.toList());
    }

    private static DTO timesdto(TimeEntity timeEntity) {
        return new DTO(
                timeEntity.getId(),
                timeEntity.getTime()
        );
    }

}
