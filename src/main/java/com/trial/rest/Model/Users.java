package com.trial.rest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {

    private int id;
    private String name;
    private String username;
    private String email;
    private UserAddress address;
    private String phone;
    private String website;
    private UserBusiness company;

    public Users(@JsonProperty("id") final int id, @JsonProperty("name") final String name,
            @JsonProperty("username") final String username, @JsonProperty("email") final String email,
            @JsonProperty("address") final UserAddress address, @JsonProperty("phone") final String phone,
            @JsonProperty("website") final String website, @JsonProperty("company") final UserBusiness company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public UserAddress getAddress() {
        return address;
    }

    public void setAddress(final UserAddress address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(final String website) {
        this.website = website;
    }

    public UserBusiness getCompany() {
        return company;
    }

    public void setCompany(final UserBusiness company) {
        this.company = company;
    }
    

    
}