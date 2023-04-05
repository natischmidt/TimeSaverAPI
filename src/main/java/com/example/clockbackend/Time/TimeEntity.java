package com.example.clockbackend.Time;
import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity (name = "time")
@Table(name = "Times")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TimeEntity {

    @Id
    @Column(name = "time")
    private float time;

}

