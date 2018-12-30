package com.justinraczak.rooms.roomswebapp;
//  Created by Justin on 12/29/18

public class Room {
    private long id;
    private String name;
    private String number;
    private String info;

    public Room() {
    }

    public Room(long id, String name, String number, String info) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.info = info;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @java.lang.Override
    public java.lang.String toString() {
        final java.lang.StringBuilder sb = new java.lang.StringBuilder("Room{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", info='").append(info).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
