package com.example.clientservice.Controller;

import com.example.clientservice.DTO.ClientDto;
import com.example.clientservice.Entity.Client;
import com.example.clientservice.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/getClients")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @GetMapping("/getClient/{id}")
    public Client getClientById(@PathVariable Integer id)
    {
        return clientService.getClientById(id);
    }

    @GetMapping("/deleteClient/{id}")
    public void DeleteClient(@PathVariable Integer id)
        {
        clientService.deleteClient(id);
     }

    @PostMapping("/AddClient")
    public void addClient(@RequestBody ClientDto clientDto) {
        clientService.addClient(clientDto);
    }
    @PutMapping("/editClient/{id}")
    public void editClient(@RequestBody ClientDto clientDto,@PathVariable Integer id){
        clientService.editClient(clientDto,id);
    }
}
