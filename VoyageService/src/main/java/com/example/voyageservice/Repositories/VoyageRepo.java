package com.example.voyageservice.Repositories;

import com.example.voyageservice.Entities.Voyage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoyageRepo extends JpaRepository<Voyage,Integer> {
}
