package com.example.MedicineApp.services;

import com.example.MedicineApp.model.Medicine;
import com.example.MedicineApp.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MedicineService {

    @Autowired
    MedicineRepository medicineRepositoryObject;

    public void addMedicine(Medicine medicineObject){

        medicineRepositoryObject.save(medicineObject);
    }

    public List<Medicine> displayAll(){

        return  medicineRepositoryObject.findAll();
    }
    public Optional<Medicine> displayById(int id){
        return medicineRepositoryObject.findById(id);
    }
    public Optional<Medicine> displayByMedicineName(String medicineName){
        return medicineRepositoryObject.findByMedicineName(medicineName);
    }
    public String update(int id, Medicine medicineObject){
        Optional<Medicine> newMedicineObject =medicineRepositoryObject.findById(id);
        if (newMedicineObject!=null){
            medicineRepositoryObject.deleteById(id);
            medicineRepositoryObject.save(medicineObject);
            return "Medicine Updated";
        }
        return "Medicine Not Updated";
    }
    public void deleteById(int id){
        medicineRepositoryObject.deleteById(id);
    }
    public void deleteAll(){
        medicineRepositoryObject.deleteAll();
    }
}
