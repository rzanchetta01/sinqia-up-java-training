package org.example;

import java.math.BigDecimal;

public class Account {
    private int number;
    private String agency;
    private String customerName;
    private BigDecimal balance;

    public Account(int number, String agency, String customerName, BigDecimal balance) {
        this.number = number;
        this.agency = agency;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
