package com.example.Vehicule_Rental.controller;

import com.example.Vehicule_Rental.model.Vehicules;
import com.example.Vehicule_Rental.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("vehicules")
public class VehiculeController {

    /**instancier la bdd
     *
     */
@Autowired
private VehiculeService vehiculeService;

@GetMapping
public Iterable<Vehicules>getVehicules(){
    return vehiculeService.getVehicules();
}
@GetMapping("/{id}")
public Vehicules getVehiculesById(@PathVariable("id") final int id){
    Optional<Vehicules> vehicules = vehiculeService.getVehicules(id);
    return vehicules.orElse(null);
}
@PostMapping
    public Vehicules createVehicule(@RequestBody Vehicules vehicules){
    return vehiculeService.save_vehicules(vehicules);
}
@PutMapping("/{id}")
public Vehicules updateVehicule(@PathVariable("id") int id, @RequestBody Vehicules vehicules){

}

}

/**Location de vehicules: Le client arrive dans un site, il y a un formulaire. il doit saisir:
 * la data de debut de la location
 * la date de fin de la location
 */
/** il y a la liste de vehicules disponibles qui s'affiche */


 /** il seleccione la voiture desirée
 * il est affiché les details de la voiture
 * le client choisi le vehicule
 * il doit remplir un formulaire pour renseigner ses infos
 * si les infos sont valides, il peut passer à la reservation
 * àl a reservation, il doit estimer les km
 * le programme calcule et affiche le prix estimé et il valide la reservation
 * à la date de la fin de la reservation, les vrais km sont relevé et le nouveau prix calculé
 */

