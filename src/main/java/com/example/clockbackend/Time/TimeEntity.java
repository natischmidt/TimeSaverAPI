package com.example.clockbackend.Time;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "time")
@Table(name = "Time")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TimeEntity {

    //need an id to delete specific time later on
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "time")
    private float time;

}

