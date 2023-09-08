package com.example.Vehicule_Rental.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Vehicule_Rental.model.Clients;
@Repository
public interface ClientRepository extends CrudRepository<Clients, Integer> {
}
