package com.turkcell.entities;
import com.turkcell.Abstract.IEntity;

import java.util.Date;
public class Customer implements IEntity {
    public Customer() {
    }

    public Customer(int id, String name, String lastName, Date birthDate, String nationalityId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.nationalityId = nationalityId;
    }

    private int id;
    private String name;
    private String lastName;
    private Date birthDate;
    private String nationalityId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }
}