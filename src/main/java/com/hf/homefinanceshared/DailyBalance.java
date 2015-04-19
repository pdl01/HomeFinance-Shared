/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hf.homefinanceshared;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pldorrell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DailyBalance {
    protected String id;
    protected String accountId;
    protected String dailyBalanceDate;
    protected double amount;
    protected Date dateCalculated;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getDailyBalanceDate() {
        return dailyBalanceDate;
    }

    public void setDailyBalanceDate(String dailyBalanceDate) {
        this.dailyBalanceDate = dailyBalanceDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
