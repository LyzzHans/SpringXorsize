package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    @GeneratedValue

    private Long Id;
    private String addressLine1;
    private String addressLine2;
    private String apartmentNumber;
    private String city;
    private String state;
    private String zipCode;
    private String zipPlus4;
    private String county;
    private String country;

    @OneToOne
    private Employee employee;

    public Address(){

    }

    public Address(String addressLine1, String addressLine2, String apartmentNumber, String city, String state, String zipCode, String zipPlus4, String county, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.zipPlus4 = zipPlus4;
        this.county = county;
        this.country = country;
    }


    public Long getId() {
        return Id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getZipPlus4() {
        return zipPlus4;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }


}
