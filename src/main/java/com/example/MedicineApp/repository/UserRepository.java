package com.example.MedicineApp.repository;

import com.example.MedicineApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


    User findByUsername(String s);
}
