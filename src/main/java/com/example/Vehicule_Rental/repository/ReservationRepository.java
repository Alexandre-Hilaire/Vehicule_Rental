package com.example.Vehicule_Rental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Vehicule_Rental.model.Reservation;
@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
}
