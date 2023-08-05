package com.example.proj1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String city;
    private String status;
    // @OneToOne(mappedBy = "address")
    // private Employee employee;
     public Address() {
    }
   
    // public Employee getEmployee() {
    //     return employee;
    // }

    // public void setEmployee(Employee employee) {
    //     this.employee = employee;
    // }

    public Address(Address address) {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
