package com.hf.homefinanceshared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pldorrell
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class ScheduledTransaction extends RegisterTransaction implements Cloneable{

    public final static int FREQUENCY_WEEKLY = 1;
    public final static int FREQUENCY_MONTHLY = 2;
    public final static int FREQUENCY_DAILY = 3;
    public final static int FREQUENCY_YEARLY = 4;
    public final static int FREQUENCY_CUSTOM = 5;
    public final static int FREQUENCY_ONE_TIME = 0;
    
    public final static String STATUS_SKIPPED = "k";
    public final static String STATUS_PAID = "p";

    
    protected int frequency;
    protected String dayOfRecurrence;
    protected int numberOfOccurrences;
    
    protected String endDate;
    protected String beginDate;
    
    protected String scheduledDate;
    
    protected int occurenceNumber;
    
    protected String originalTransactionId;
    protected boolean original;

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }
    
    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getDayOfRecurrence() {
        return dayOfRecurrence;
    }

    public void setDayOfRecurrence(String dayOfRecurrence) {
        this.dayOfRecurrence = dayOfRecurrence;
    }

    public int getNumberOfOccurrences() {
        return numberOfOccurrences;
    }

    public void setNumberOfOccurrences(int numberOfOccurrences) {
        this.numberOfOccurrences = numberOfOccurrences;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public int getOccurenceNumber() {
        return occurenceNumber;
    }

    public void setOccurenceNumber(int occurenceNumber) {
        this.occurenceNumber = occurenceNumber;
    }

    public String getOriginalTransactionId() {
        return originalTransactionId;
    }

    public void setOriginalTransactionId(String originalTransactionId) {
        this.originalTransactionId = originalTransactionId;
    }

    
    
}
