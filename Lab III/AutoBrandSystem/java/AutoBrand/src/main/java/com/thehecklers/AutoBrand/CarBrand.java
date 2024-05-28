package com.thehecklers.AutoBrand;

import java.util.List;

public class CarBrand {
    private String name;
    private String country;
    private String abbreviation;

    public CarBrand(String name, String country, String abbreviation){
        this.name = name;
        this.country = country;
        this.abbreviation = abbreviation;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void add(CarBrand carBrands) {
    }

    public int indexOf(CarBrand c) {
        return 0;
    };

    public void setCars(int brandIndex, CarBrand carBrands) {
    }
}
