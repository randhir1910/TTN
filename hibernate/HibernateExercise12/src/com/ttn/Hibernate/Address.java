package com.ttn.Hibernate;

import javax.persistence.Embeddable;

/**
 * Created by randhir on 6/7/17.
 */
@Embeddable
public class Address
{
    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private Integer streetNumber;
    private String location;
    private String state;
}
