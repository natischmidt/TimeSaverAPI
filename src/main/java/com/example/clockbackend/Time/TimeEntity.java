package com.example.clockbackend.Time;
import lombok.*;


@Data
@AllArgsConstructor

public class TimeEntity {

    //need an id to delete specific time later on
    private String id;
    private float time;

}

