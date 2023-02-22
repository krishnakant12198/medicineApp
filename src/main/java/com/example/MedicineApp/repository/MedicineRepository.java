package com.example.MedicineApp.repository;

import com.example.MedicineApp.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{

    Optional<Medicine> findByMedicineName(String medicineName);
}
