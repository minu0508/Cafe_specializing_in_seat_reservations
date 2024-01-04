package com.example.dbcafe.domain.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@AllArgsConstructor
public class PackageReservationBlockDto {
    private int blockId;

    private LocalDate startDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private String dayOfWeek;
}
