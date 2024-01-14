package com.example.voyageservice.DTO;

import java.util.List;
import java.util.Map;

public record VoyageDto(List<Integer> list_idCours, Map<Integer,Integer> list_idStation_idService) {
}
