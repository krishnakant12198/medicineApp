package com.example.MedicineApp.controller;

import com.example.MedicineApp.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.MedicineApp.services.MedicineService;

import java.util.List;
import java.util.Optional;

@RestController
public class MedicineController {

    @Autowired
    MedicineService medicineServiceObject;

    @PostMapping("/add")
    public  String add(@RequestBody Medicine medicineObject) {
        medicineServiceObject.addMedicine(medicineObject);
        return "medicine added";
    }

    @GetMapping("/display-all")
        public List<Medicine> display(){
            return medicineServiceObject.displayAll();
       }

    @GetMapping("/display-by-id/{id}")
    public Optional<Medicine> displayById(@PathVariable int id){
        return medicineServiceObject.displayById(id);
    }

   @GetMapping("/display-by-medicineName/{medicineName}")
    public Optional<Medicine> displayByMedicineName(@PathVariable String medicineName){
        return medicineServiceObject.displayByMedicineName(medicineName);
   }
   @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestBody Medicine medicineObject) {
       return medicineServiceObject.update(id, medicineObject);
   }
   @DeleteMapping("/delete-by-id/{id}")
    public String deleteById(@PathVariable int id){
        medicineServiceObject.deleteById(id);
        return "Medicine Deleted";
   }
   @DeleteMapping("/delete-all")
    public String deleteAll(){
        medicineServiceObject.deleteAll();
        return "All Medicines Deleted";
   }
   }

