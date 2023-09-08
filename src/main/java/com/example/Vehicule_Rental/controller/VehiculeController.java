package com.example.Vehicule_Rental.controller;

import com.example.Vehicule_Rental.model.Vehicules;
import com.example.Vehicule_Rental.repository.VehiculeRepository;
import com.example.Vehicule_Rental.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/vehicules")
public class VehiculeController {

@Autowired
private VehiculeService vehiculeService;

@GetMapping
public Iterable<Vehicules>getVehicules(){
    return vehiculeService.getVehicules();
}
@GetMapping("/{id}")
public Vehicules getVehiculesById(@PathVariable("id") final int id){
    Optional<Vehicules> vehicule = vehiculeService.getVehicule(id);
    return vehicule.orElse(null);
}
//@PostMapping
//    public Vehicules createVehicule(@RequestBody Vehicules vehicules){
//    return vehiculeService.save_vehicules(vehicules);
//}
//@PutMapping("/{id}")
//public Vehicules updateVehicule(@PathVariable("id") int id, @RequestBody Vehicules vehicules){
//    Optional<Vehicules> vehicule = vehiculeService.getVehicule(id);
//    if (vehicule.isPresent()){
//        Vehicules currentVehicule = vehicule.get();
//
//    }
//}

}

