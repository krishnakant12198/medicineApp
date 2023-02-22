package com.example.MedicineApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medicine {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;
    private String medicineName;
    private int mrp;
    private String disease;



}
