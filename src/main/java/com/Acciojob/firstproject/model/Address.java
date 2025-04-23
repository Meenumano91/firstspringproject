package com.Acciojob.firstproject.model;

public class Address {

    private int doorno;

    @Override
    public String toString() {
        return "Address{" +
                "doorno=" + doorno +
                ", streetname='" + streetname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    private String streetname;

    public Address()
    {

    }

    public Address(int doorno, String streetname, String city) {
        this.doorno = doorno;
        this.streetname = streetname;
        this.city = city;
    }

    public int getDoorno() {
        return doorno;
    }

    public void setDoorno(int doorno) {
        this.doorno = doorno;
    }

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;
}
