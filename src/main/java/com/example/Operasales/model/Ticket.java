package com.example.Operasales.model;

import com.example.Operasales.model.Primera;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "pr_id", nullable = false)
    private Primera pr;
    private double price;
    private int place;

    public Ticket(){

    }


    public Ticket(Primera pr, double price, int place) {
        this.pr = pr;
        this.price = price;
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Primera getPr() {
        return pr;
    }

    public void setPr(Primera pr) {
        this.pr = pr;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "pr=" + pr +
                ", price=" + price +
                ", place=" + place +
                '}';
    }
}
