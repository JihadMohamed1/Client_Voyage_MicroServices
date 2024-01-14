package com.example.clientservice.Service;

import com.example.clientservice.DTO.ClientDto;
import com.example.clientservice.Entity.Client;
import com.example.clientservice.Repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    public static int i=5;
    @Autowired
    ClientRepo clientRepo;

    public List<Client> getClients(){
        return clientRepo.findAll();
    }
    public Client getClientById(Integer id){
        return clientRepo.findById(id).orElseThrow(()->new RuntimeException("no client"));
    }
    public void deleteClient(Integer id){
         clientRepo.deleteById(id);
    }
    public void addClient(ClientDto clientDto){

        Client client=new Client();
        client.setId(i++);
        client.setNom(clientDto.nom());
        client.setPrenom(clientDto.prenom());
        client.setEmail(clientDto.email());
        client.setNum(clientDto.num());
        client.setId_voyage(clientDto.id_voyage());
        clientRepo.save(client);
    }

    public void editClient(ClientDto clientDto,Integer id){
        Client client=clientRepo.findById(id).orElseThrow(()->new RuntimeException("no client"));
        client.setNom(clientDto.nom());
        client.setPrenom(clientDto.prenom());
        client.setEmail(clientDto.email());
        client.setNum(clientDto.num());
        client.setId_voyage(clientDto.id_voyage());
        clientRepo.save(client);
    }
}
