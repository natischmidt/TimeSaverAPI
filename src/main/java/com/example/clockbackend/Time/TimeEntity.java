package com.example.clockbackend.Time;
import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.SEQUENCE;


@Entity(name = "time")
@Table(name = "Time")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TimeEntity {

    //need an id to delete specific time later on

    @Id
    @SequenceGenerator(name="timeSeq",sequenceName="TIME-SEQUENCE",allocationSize = 1)
    @GeneratedValue(strategy=SEQUENCE,generator="timeSeq")
    @Column(name = "ID")
    private Integer id;


    @Column(name = "TIME")
    private Integer time;

}

