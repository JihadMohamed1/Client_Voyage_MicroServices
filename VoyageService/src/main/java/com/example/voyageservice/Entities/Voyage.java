package com.example.voyageservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Voyage {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    @ElementCollection
    public List<Integer> list_id_course;

    @ElementCollection
    public Map<Integer,Integer> list_idStation_idService;
}
