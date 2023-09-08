package com.example.Vehicule_Rental.service;

import com.example.Vehicule_Rental.model.Vehicules;
import com.example.Vehicule_Rental.repository.VehiculeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class VehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    public Optional<Vehicules> getVehicule(final int id) {
        return vehiculeRepository.findById(id);
    }

    public Iterable<Vehicules> getVehicules() {
        return vehiculeRepository.findAll();
    }

    public void deleteVehicule(final int id) {
        vehiculeRepository.deleteById(id);
    }

    public Vehicules saveVehicule(Vehicules vehicule) {
        Vehicules savedVehicule = vehiculeRepository.save(vehicule);
        return savedVehicule;
    }

}
