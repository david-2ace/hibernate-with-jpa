package com.han.hibernate.domain;

import java.util.Set;

/**
 * Created by han on 15. 8. 31.
 * email : thetis15@hanmail.net
 */
public class User {
    private String username;
    private String name;
    private String address;
    private Set billingDetails;

    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set getBillingDetails() {
        return billingDetails;
    }

    public void setBillingDetails(Set billingDetails) {
        this.billingDetails = billingDetails;
    }
}
