/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hf.homefinanceshared;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

/**
 *
 * @author pldorrell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Budget {
    protected String id;
    protected String name;
    protected boolean active;
    
    protected boolean generated;
    protected boolean sourceBudget;
    protected String startingOnDate;
    protected int numberOfTimePeriods = 12;
    protected int timePeriod = 1;  //1=Month,2=Weeks,3=days, 4=years
    
    protected BudgetCategory[] incomeItems;
    protected BudgetCategory[] expenseItems;
    protected BudgetCategory[] transferItems;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isGenerated() {
        return generated;
    }

    public void setGenerated(boolean generated) {
        this.generated = generated;
    }

    public boolean isSourceBudget() {
        return sourceBudget;
    }

    public void setSourceBudget(boolean sourceBudget) {
        this.sourceBudget = sourceBudget;
    }

    public BudgetCategory[] getIncomeItems() {
        return incomeItems;
    }

    public void setIncomeItems(BudgetCategory[] incomeItems) {
        this.incomeItems = incomeItems;
    }

    public BudgetCategory[] getExpenseItems() {
        return expenseItems;
    }

    public void setExpenseItems(BudgetCategory[] expenseItems) {
        this.expenseItems = expenseItems;
    }

    public BudgetCategory[] getTransferItems() {
        return transferItems;
    }

    public void setTransferItems(BudgetCategory[] transferItems) {
        this.transferItems = transferItems;
    }

    public String getStartingOnDate() {
        return startingOnDate;
    }

    public void setStartingOnDate(String startingOnDate) {
        this.startingOnDate = startingOnDate;
    }

    public int getNumberOfTimePeriods() {
        return numberOfTimePeriods;
    }

    public void setNumberOfTimePeriods(int numberOfTimePeriods) {
        this.numberOfTimePeriods = numberOfTimePeriods;
    }

    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
    }
    
}
