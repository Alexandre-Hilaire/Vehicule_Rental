package com.example.Vehicule_Rental.controller;

import com.example.Vehicule_Rental.model.Reservations;
import com.example.Vehicule_Rental.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/reservations")
public class ReservationsController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public Reservations createReservation(@RequestBody Reservations reservation){
        return reservationService.saveReservation(reservation);
    }
    @GetMapping("/all")
    public Iterable<Reservations> getAllReservations(){
        return reservationService.getReservations();
    }
    @GetMapping("/{id}")
    public Reservations getReservationById(@PathVariable final int id){
        Optional<Reservations> reservation = reservationService.getReservationById(id);
        return reservation.orElse(null);
    }
    @PutMapping("/{id}")
    public Reservations updateReservations(@PathVariable("id") final int id, @RequestBody Reservations reservations){
        Optional<Reservations> reservation = reservationService.getReservationById(id);
        if (reservation.isPresent()) {
            Reservations currentReservation = reservation.get();
            Date start_date = reservations.getStart_date();
            if (start_date != null){
                currentReservation.setStart_date(start_date);
            }
            Date end_date = reservations.getEnd_date();
            if (end_date != null){
                currentReservation.setEnd_date(end_date);
            }
            int km_estimate = reservations.getKm_estimate();
                currentReservation.setKm_estimate(km_estimate);
            int estimated_price = reservations.getEstimated_price();
                currentReservation.setEstimated_price(estimated_price);
            int id_clients = reservations.getId_clients();
                currentReservation.setId_clients(id_clients);
            int car_id = reservations.getCar_id();
                currentReservation.setCar_id(car_id);

                return currentReservation;
        }
        else{
            return null;
        }
    }
    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable("id") final int id){
        reservationService.deleteReservation(id);
    }
}
