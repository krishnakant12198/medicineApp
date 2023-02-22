package com.example.MedicineApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orderNo;
    private String userName;
    private String address;
    private long phoneNo;

 //   @OneToOne(mappedBy = "orders",fetch = FetchType.EAGER)
 //   private Medicine medicines;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "mid")
    private Medicine medicineObj;

}
