package com.example.Vehicule_Rental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Vehicules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String registration;
    private String brand;
    private String model;
    private String color;
    private int base_price;
    private int km_price;
    private int fiscal_horsepower;
    private int id_clients;

    public Vehicules (int id, String registration, String brand, String model, String color, int base_price, int km_price, int fiscal_horsepower, int id_clients){
        this.id = id;
        this.registration = registration;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.base_price = base_price;
        this.km_price = km_price;
        this.fiscal_horsepower = fiscal_horsepower;
        this.id_clients = id_clients;
    }

    public Vehicules() {

    }
}
