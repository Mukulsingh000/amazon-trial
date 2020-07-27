package com.trial.rest.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserBusiness {

    private String name;
    private String catchPhrase;
    private String bs;

    public UserBusiness(@JsonProperty("name") final String name, @JsonProperty("catchPhrase") final String catchPhrase,
            @JsonProperty("bs") final String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;

    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(final String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(final String bs) {
        this.bs = bs;
    }
    
    
}