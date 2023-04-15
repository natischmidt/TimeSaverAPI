package com.example.clockbackend.Time;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;



@Service
public class TimeService {

    TimeRepo timeRepo;

    public TimeService(TimeRepo timeRepo){
        this.timeRepo = timeRepo;
    }

    public Optional<TimeEntity> Save(DTO dto) {
        TimeEntity timeEntity = new TimeEntity(
                        null,
                        dto.time()
                );
        timeRepo.save(timeEntity);
        return Optional.of(timeEntity);
    }

    public List<TimeEntity> all() {

        return timeRepo.findAll();
    }

    //delete a saved time via id WIP
    public Boolean Delete(Integer id) {
        if (timeRepo.existsById(id)) {
            timeRepo.deleteById(id);
            return true;
        }
        return false;
    }


}
