package com.example.voyageservice.Controllers;

import com.example.voyageservice.DTO.VoyageDto;
import com.example.voyageservice.Entities.Voyage;
import com.example.voyageservice.Services.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Voyage")
public class VoyageController {
    @Autowired
    VoyageService voyageService;
@GetMapping("/getVoyages")
    public List<Voyage> getVoyages(){
      return voyageService.getVoyages();
    }
    @GetMapping("/getVoyage/{id}")
    public  Voyage getVoyage(@PathVariable Integer id){
        return voyageService.getVoyage(id);
    }
    @DeleteMapping("/deleteVoyage/{id}")
    public  void deleteVoyage(@PathVariable Integer id){
        voyageService.deleteVoyage(id);
    }
    @PostMapping("/addVoyage")
    public  void addVoyage(@RequestBody VoyageDto voyageDto){
       voyageService.addVoyage(voyageDto);
    }
    @PutMapping("/editVoyage/{id}")
    public void editVoyage(VoyageDto voyageDto,Integer id)
    {
        voyageService.editVoyage(voyageDto,id);
    }
}
