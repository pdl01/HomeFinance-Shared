    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hf.homefinanceshared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author phillip.dorrell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class CategorySplit {
    protected String category;
    protected double txnAmount; 
    protected String message;
    protected boolean transfer;
    protected String transferTxn;

    public boolean isTransfer() {
        return transfer;
    }

    public void setTransfer(boolean transfer) {
        this.transfer = transfer;
    }

    public String getTransferTxn() {
        return transferTxn;
    }

    public void setTransferTxn(String transferTxn) {
        this.transferTxn = transferTxn;
    }
    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(double txnAmount) {
        this.txnAmount = txnAmount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
