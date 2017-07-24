package com.ttn.Hibernate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by randhir on 5/7/17.
 */
@Entity
public class Author
{
     @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer Id;
    @Column (name="first_name")
      String firstName;
    @Column (name="last_name")
    private String lastName;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date DOB;

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }
     @ElementCollection
    List<String> subject=new ArrayList<>();
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Embedded
    Address address;


    public int getId() {
        return Id;
    }
    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }


    public void setId(int id) {
        Id = id;
    }

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


}
