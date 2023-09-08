package com.example.Vehicule_Rental.controller;

import com.example.Vehicule_Rental.model.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientsController {
    @Autowired
    private ClientService clientService;

    @GetMapping
    public Iterable<Clients>getClients(){
        return clientService.getClients();
    }
    @GetMapping("{id}")
    public Clients getClientsById(@PathVariable("id") final int id){
        Optional<Clients> client = clientService.getClient(id);
        return client.orElse(null);
    }
    @PostMapping
    public Clients createClients(@RequestBody Clients clients){
        return clientService.save_clients(clients);
    }
    @PutMapping("{id}")
    public Clients updateClients(@PathVariable("id") final int id, @RequestBody Clients clients){
        Optional<Clients> client = clientService.getClient(id);
        if (client.isPresent()){
            Clients currentClient = client.get();
            String last_name = clients.getLast_name();
            if (last_name != null){
                currentClient.setLast_name(last_name);
            }

        }
    }
}
