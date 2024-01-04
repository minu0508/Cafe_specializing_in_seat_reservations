package com.example.dbcafe.domain.reservation.service;

import com.example.dbcafe.domain.reservation.repository.ReservationItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationItemService {
    private final ReservationItemRepository reservationItemRepository;
}
