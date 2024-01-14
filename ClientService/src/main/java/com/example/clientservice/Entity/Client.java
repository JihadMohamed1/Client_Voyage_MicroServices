package com.example.clientservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     Integer id;
    String nom;
    String prenom;
    Integer num;
    String email;
    Integer IdVoyage;

}
