package com.example.MedicineApp.controller;

import com.example.MedicineApp.model.Medicine;
import com.example.MedicineApp.model.Orders;
import com.example.MedicineApp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderServiceObject;

    @PostMapping("/add-order")
    public  String add(@RequestBody Orders ordersObject) {
        orderServiceObject.addOrder(ordersObject);
        return "ordered";
    }
    @GetMapping("/display-all-order")
    public List<Orders> displayAllOrder(){
        return orderServiceObject.displayAllOrder();
    }
    @PutMapping("/updateOder/{id}")
    public String update(@PathVariable int id, @RequestBody Orders ordersObject) {
        return orderServiceObject.updateOrder(id, ordersObject);
    }
    @DeleteMapping("/deleteOder-by-id/{id}")
    public String deleteById(@PathVariable int id){
        orderServiceObject.deleteById(id);
        return "Order Deleted";
    }
    @DeleteMapping("/deleteOder-all")
    public String deleteAll(){
        orderServiceObject.deleteAll();
        return "All Order Deleted";
    }

}
