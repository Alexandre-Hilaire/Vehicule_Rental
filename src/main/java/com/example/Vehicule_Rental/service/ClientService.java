package com.example.Vehicule_Rental.service;

import com.example.Vehicule_Rental.model.Clients;
import com.example.Vehicule_Rental.repository.ClientRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Data
@Service
public class ClientService {

        @Autowired
        private ClientRepository clientRepository;

        public Optional<Clients> getClientById(final int id) {
            return clientRepository.findById(id);
        }

        public Iterable<Clients> getClients() {
            return clientRepository.findAll();
        }

        public void deleteClient(final int id) {
            clientRepository.deleteById(id);
        }

        public Clients saveClient(Clients client) {
            Clients savedClient = clientRepository.save(client);
            return savedClient;
        }

    }
