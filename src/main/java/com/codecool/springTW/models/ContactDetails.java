package com.codecool.springTW.models;

import javax.persistence.*;

@Entity
@Table(name="contact_details")
public class ContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String city;
    private String street;
    @OneToOne
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

    public ContactDetails(String email, String city, String street) {
        this.email = email;
        this.city = city;
        this.street = street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
