package com.trial.rest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAddressGeo {

    private String lat;
    private String lng;

    public UserAddressGeo(@JsonProperty("lat") final String lat, @JsonProperty("lng") final String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(final String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(final String lng) {
        this.lng = lng;
    }
    
}