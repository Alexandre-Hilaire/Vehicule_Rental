package com.example.Vehicule_Rental.service;

import com.example.Vehicule_Rental.model.Reservations;
import com.example.Vehicule_Rental.repository.ReservationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public Optional<Reservations> getReservation(final int id) {
        return reservationRepository.findById(id);
    }

    public Iterable<Reservations> getReservations() {
        return reservationRepository.findAll();
    }

    public void deleteReservation(final int id) {
        reservationRepository.deleteById(id);
    }

    public Reservations saveReservation(Reservations reservation) {
        Reservations savedReservation = reservationRepository.save(reservation);
        return savedReservation;
    }

}
