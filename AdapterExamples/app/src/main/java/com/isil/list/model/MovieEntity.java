package com.isil.list.model;

/**
 * Created by Profesor on 27/10/2016.
 */
public class MovieEntity {

    private int id;
    private String title;
    private String desc;
    private double price;
    private boolean cartelera;

    public MovieEntity(int id, String title, String desc, double price, boolean cartelera) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.cartelera = cartelera;
    }

    public MovieEntity(String title, boolean cartelera) {
        this.title = title;
        this.cartelera = cartelera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCartelera() {
        return cartelera;
    }

    public void setCartelera(boolean cartelera) {
        this.cartelera = cartelera;
    }
}
