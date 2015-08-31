package com.han.hibernate.domain;

/**
 * Created by han on 15. 8. 31.
 * email : thetis15@hanmail.net
 */
public class BillingDetails {
    private String accountNumber;
    private String accountName;
    private String accountType;
    private User user;

    public BillingDetails() {}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
