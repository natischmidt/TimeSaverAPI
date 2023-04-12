package com.example.clockbackend.Time;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity(name = "time")
@Table(name = "Time")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TimeEntity {

    //need an id to delete specific time later on
    @Id
    @Column(name = "uuid")
    private UUID uuid;
    @Column(name = "time")
    private float time;


    public TimeEntity(UUID uuid) {
        this.uuid = uuid;
    }

}

