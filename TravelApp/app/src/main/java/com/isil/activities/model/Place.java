package com.isil.activities.model;

import java.io.Serializable;

/**
 * Created by emedinaa on 16/04/16.
 */
public class Place implements Serializable {
    private int id;
    private String nick;
    private String title;
    private String desc;
    private int photo;
    private String headerColor;

    public Place(int id, String nick, String title, String desc, int photo, String headerColor) {
        this.id = id;
        this.nick = nick;
        this.title = title;
        this.desc = desc;
        this.photo = photo;
        this.headerColor = headerColor;
    }

    public Place() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getHeaderColor() {
        return headerColor;
    }

    public void setHeaderColor(String headerColor) {
        this.headerColor = headerColor;
    }
}
