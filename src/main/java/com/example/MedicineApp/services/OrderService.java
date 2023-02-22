package com.example.MedicineApp.services;


import com.example.MedicineApp.model.Orders;
import com.example.MedicineApp.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepositoryObject;

    public void addOrder(Orders ordersObject){

        orderRepositoryObject.save(ordersObject);
    }


    public List<Orders> displayAllOrder(){

        return  orderRepositoryObject.findAll();
    }

    public String updateOrder(int id, Orders ordersObject){
        Optional<Orders> newOrderObject =orderRepositoryObject.findById(id);
        if (newOrderObject!=null){
            orderRepositoryObject.deleteById(id);
            orderRepositoryObject.save(ordersObject);
            return "Order Updated";
        }
        return "Order Not Updated";
    }

    public void deleteById(int id){
        orderRepositoryObject.deleteById(id);
    }
    public void deleteAll(){
        orderRepositoryObject.deleteAll();
    }
}
