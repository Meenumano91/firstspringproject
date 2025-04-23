package com.Acciojob.firstproject.model;

public class Employee {

    private int id;

    public Employee()
    {

    }

    public Employee(int id, String name, String email, String designation, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.address = address;
    }

    private String name;
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", destination='" + designation + '\'' +
                ", address=" + address +
                '}';
    }

    private String designation;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

}
