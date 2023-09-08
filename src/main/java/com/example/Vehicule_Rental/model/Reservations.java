package com.example.Vehicule_Rental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date start_date;
    private Date end_date;
    private int km_estimate;
    private int estimated_price;
    private int id_clients;
    private int car_id;

    public Reservations (int id,Date start_date, Date end_date, int km_estimate, int estimated_price, int id_clients, int car_id) {
        this.id = id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.km_estimate = km_estimate;
        this.estimated_price = estimated_price;
        this.id_clients = id_clients;
        this.car_id = car_id;
    }

    public Reservations() {

    }
}
