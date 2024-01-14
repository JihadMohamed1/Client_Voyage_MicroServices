package com.example.voyageservice.Services;

import com.example.voyageservice.DTO.VoyageDto;
import com.example.voyageservice.Entities.Voyage;
import com.example.voyageservice.Repositories.VoyageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VoyageService {
    @Autowired
    VoyageRepo voyageRepo;

    public List<Voyage> getVoyages(){
        return voyageRepo.findAll();
    }
    public  Voyage getVoyage(Integer id){
        return voyageRepo.findById(id).orElseThrow(()->new RuntimeException("no voyage"));
    }
    public  void deleteVoyage(Integer id){
         voyageRepo.deleteById(id);
    }
    public  void addVoyage(VoyageDto voyageDto){
        Voyage voyage=new Voyage();
        voyage.list_id_course.addAll(voyageDto.list_idCours());
        voyage.list_idStation_idService.putAll(voyageDto.list_idStation_idService());
        voyageRepo.save(voyage);
    }
    public void editVoyage(VoyageDto voyageDto,Integer id)
    {
        Voyage voyage= voyageRepo.findById(id).orElseThrow(()->new RuntimeException("no voyage"));
        voyage.list_id_course.addAll(voyageDto.list_idCours());
        voyage.list_idStation_idService.putAll(voyageDto.list_idStation_idService());
        voyageRepo.save(voyage);
    }

}
