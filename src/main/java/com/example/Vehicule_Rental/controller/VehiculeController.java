package com.example.Vehicule_Rental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeController {

    /**instancier la bdd
     *
     */
//@Autowired
//private VehiculeRepository vehiculeRepository;

}

/**Location de vehicules: Le client arrive dans un site, il y a un formulaire. il doit saisir:
 * la data de debut de la location
 * la date de fin de la location
 */
/** il y a la liste de vehicules disponibles qui s'affiche */
@GetMapping(path="/all")
public @ResponseBody Iterable<Vehicules> getAllVehicules() {
    return vehiculeRepository.findAll();
}

 /** il seleccione la voiture desirée
 * il est affiché les details de la voiture
 * le client choisi le vehicule
 * il doit remplir un formulaire pour renseigner ses infos
 * si les infos sont valides, il peut passer à la reservation
 * àl a reservation, il doit estimer les km
 * le programme calcule et affiche le prix estimé et il valide la reservation
 * à la date de la fin de la reservation, les vrais km sont relevé et le nouveau prix calculé
 */

