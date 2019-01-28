package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class HomeList {
    @Id
    private String namee;
    private String typee;
    private String Price;

    public HomeList(String typee, String namee, String price) {
        this.typee = typee;
        this.namee = namee;
        this.Price = price;
    }

    public HomeList() {
    }

    public String getTypee() {
        return typee;
    }

    public void setTypee(String typee) {
        this.typee = typee;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

 

    @Override
	public String toString() {
		return "HomeList [namee=" + namee + ", typee=" + typee + ", Price=" + Price + "]";
	}
}
