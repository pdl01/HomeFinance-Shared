package com.hf.homefinanceshared;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author phillip.dorrell
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Account implements Comparable<Account>{
    protected String id;
    protected String name;
    protected String externalId;
    protected String accountNumber;
    
    protected FinancialInstitution financialInstitution;
    
    protected boolean enabled;
    protected Date lastModifiedDate;
    protected Date createdDate;
    
    protected double startingBalance;
    protected double currentBalance;
    protected Date balanceLastCalculatedDate;
    protected String accountType;
    protected String webAddress;
    
    protected Date lastImportActionDate;
    protected String lastImportedTransactionDate;  //String for display

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
    
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public FinancialInstitution getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(FinancialInstitution financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public double getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getBalanceLastCalculatedDate() {
        return balanceLastCalculatedDate;
    }

    public void setBalanceLastCalculatedDate(Date balanceLastCalculatedDate) {
        this.balanceLastCalculatedDate = balanceLastCalculatedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public int compareTo(Account o) {
        return this.name.compareTo(o.getName());                
    }

    public Date getLastImportActionDate() {
        return lastImportActionDate;
    }

    public void setLastImportActionDate(Date lastImportActionDate) {
        this.lastImportActionDate = lastImportActionDate;
    }

    public String getLastImportedTransactionDate() {
        return lastImportedTransactionDate;
    }

    public void setLastImportedTransactionDate(String lastImportedTransactionDate) {
        this.lastImportedTransactionDate = lastImportedTransactionDate;
    }
    
}
