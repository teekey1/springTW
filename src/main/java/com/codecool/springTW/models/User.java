package com.codecool.springTW.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "details_id")
    private ContactDetails contactDetails;
    @ManyToMany(cascade = { CascadeType.ALL })
    private Set<Car> cars = new HashSet<>();

    public User(){}

    public User(String name, String surname, ContactDetails contactDetails) {
        this.name = name;
        this.surname = surname;
        this.contactDetails = contactDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
