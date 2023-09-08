package com.example.Vehicule_Rental.controller;

import com.example.Vehicule_Rental.model.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientsController {
    @Autowired
    private ClientService clientService;
    @PostMapping
    public Clients createClients(@RequestBody Clients clients){
        return clientService.save_clients(clients);
    }
    @GetMapping
    public Iterable<Clients>getClients(){
        return clientService.getClients();
    }
    @GetMapping("{id}")
    public Clients getClientsById(@PathVariable("id") final int id){
        Optional<Clients> client = clientService.getClient(id);
        return client.orElse(null);
    }

    @PutMapping("{id}")
    public Clients updateClients(@PathVariable("id") final int id, @RequestBody Clients clients) {
        Optional<Clients> client = clientService.getClient(id);
        if (client.isPresent()) {
            Clients currentClient = client.get();
            String last_name = clients.getLast_name();
            if (last_name != null) {
                currentClient.setLast_name(last_name);
            }
            String first_name = clients.getFirst_name();
            if (first_name != null) {
                currentClient.setFirst_name(first_name);
            }
            Date datebirth = clients.getDatebirth();
            if (datebirth != null) {
                currentClient.setDatebirth(datebirth);
            }
            int license_number = clients.getLicense_number();
            currentClient.setLicense_number(license_number);
            return currentClient;
        } else {
            return null;
        }
    }
    @DeleteMapping
    public void deleteClients(@PathVariable("id") final int id){
        clientService.deleteClient(id);
    }

}
