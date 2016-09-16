package com.isil.practice01;

import java.io.Serializable;

/**
 * Created by eduardomedina on 15/09/16.
 */
public class AgencyEntity  implements Serializable{

    private int id;
    private String title;
    private String address;
    private String schedule;
    private String lat;
    private String lng;
    private boolean state;

    public AgencyEntity(int id, String title, String address, String schedule, String lat, String lng, boolean state) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.schedule = schedule;
        this.lat = lat;
        this.lng = lng;
        this.state = state;
    }

    public AgencyEntity() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
