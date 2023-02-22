package com.example.MedicineApp.services;

import com.example.MedicineApp.model.User;
import com.example.MedicineApp.repository.UserRepository;
import com.example.MedicineApp.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
  @Autowired
  UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User userObj = userRepository.findByUsername(s);
        return new CustomUserDetails(userObj);
    }
}
