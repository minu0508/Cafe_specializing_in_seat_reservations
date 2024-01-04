package com.example.dbcafe.domain.reservation.controller;

import com.example.dbcafe.domain.reservation.service.ReservationChangeRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/reservation-change-request")
public class ReservationChangeRequestController {
    private final ReservationChangeRequestService reservationChangeRequestService;
}
