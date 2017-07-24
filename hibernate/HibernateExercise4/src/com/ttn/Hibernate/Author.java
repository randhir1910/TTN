package com.ttn.Hibernate;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by randhir on 5/7/17.
 */
@Entity
public class Author
{
    public int getId() {
        return Id;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
  @Temporal(TemporalType.DATE)
    private Date DOB;

    public void setId(int id) {
        Id = id;
    }
    @Id @GeneratedValue(strategy =GenerationType.AUTO)
    private int Id;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String firstName;
    private String lastName;
    private int age;
}
