package com.example.Vehicule_Rental.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String last_name;
    private String first_name;
    private Date datebirth;
    private int license_number;

    public Clients (int id, String last_name, String first_name, Date datebirth, int license_number){
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.datebirth = datebirth;
        this.license_number = license_number;
    }

    public Clients() {

    }
}
