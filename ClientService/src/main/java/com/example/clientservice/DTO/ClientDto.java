package com.example.clientservice.DTO;

public record ClientDto(
        String nom,
        String prenom,
        Integer num,
        String email,
        Integer IdVoyage
                        ) { }
