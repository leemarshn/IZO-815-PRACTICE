package com.company.util;

public class Students {
    private String name;
    private long id;
    private int phone;

//    public Students(String name, long id, int phone) {
//        this.name = name;
//        this.id = id;
//        this.phone = phone;
//    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
