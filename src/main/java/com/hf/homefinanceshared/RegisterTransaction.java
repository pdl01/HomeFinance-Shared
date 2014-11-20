package com.hf.homefinanceshared;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author phillip.dorrell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class RegisterTransaction implements Comparable<RegisterTransaction>{
    
    protected String id;
    protected Date createdDate;
    protected Date lastModifiedDate;
    
    protected boolean credit; //is a credit transaction to primary account
    protected String txnDate;
    protected double txnAmount;
    
    protected String txnType;
    protected String txnPersonalRefNumber;
    protected String txnExternalRefNumber;
    
    protected String category; //TODO splits
    protected CategorySplit[] categorySplits;
    protected String primaryAccount;
    protected String secondaryAccount;
    
    protected String memo;
    protected boolean flagged;
    protected String flagComment;
    
    protected String payee;

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public double getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(double txnAmount) {
        this.txnAmount = txnAmount;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public String getTxnPersonalRefNumber() {
        return txnPersonalRefNumber;
    }

    public void setTxnPersonalRefNumber(String txnPersonalRefNumber) {
        this.txnPersonalRefNumber = txnPersonalRefNumber;
    }

    public String getTxnExternalRefNumber() {
        return txnExternalRefNumber;
    }

    public void setTxnExternalRefNumber(String txnExternalRefNumber) {
        this.txnExternalRefNumber = txnExternalRefNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(String primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public String getSecondaryAccount() {
        return secondaryAccount;
    }

    public void setSecondaryAccount(String secondaryAccount) {
        this.secondaryAccount = secondaryAccount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public boolean isFlagged() {
        return flagged;
    }

    public void setFlagged(boolean flagged) {
        this.flagged = flagged;
    }

    public String getFlagComment() {
        return flagComment;
    }

    public void setFlagComment(String flagComment) {
        this.flagComment = flagComment;
    }
    
    private String buildKey() {
        return this.id +":" + this.txnDate + ":"+this.payee+":"+this.txnAmount;
    }
    @Override
    public int compareTo(RegisterTransaction o) {
        return this.buildKey().compareTo(o.buildKey());
    }

    public CategorySplit[] getCategorySplits() {
        return categorySplits;
    }

    public void setCategorySplits(CategorySplit[] categorySplits) {
        this.categorySplits = categorySplits;
    }
    
    
}
