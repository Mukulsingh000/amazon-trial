package com.trial.rest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAddress {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private UserAddressGeo geo;

    public UserAddress(@JsonProperty("street") final String street, @JsonProperty("suite") final String suite,
            @JsonProperty("city") final String city, @JsonProperty("zipcode") final String zipcode,
            @JsonProperty("geo") final UserAddressGeo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(final String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    public UserAddressGeo getGeo() {
        return geo;
    }

    public void setGeo(final UserAddressGeo geo) {
        this.geo = geo;
    }
    
    
}