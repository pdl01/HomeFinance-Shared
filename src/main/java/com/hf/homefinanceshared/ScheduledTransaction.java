package com.hf.homefinanceshared;

/**
 *
 * @author pldorrell
 */
public class ScheduledTransaction extends RegisterTransaction {

    public final static int FREQUENCY_WEEKLY = 1;
    public final static int FREQUENCY_MONTHLY = 2;
    public final static int FREQUENCY_DAILY = 3;
    public final static int FREQUENCY_YEARLY = 4;
    public final static int FREQUENCY_CUSTOM = 5;
    public final static int FREQUENCY_ONE_TIME = 0;
    
    public int frequency;
    public String dayOfRecurence;
    public int numberOfOccurrences;
    
    public String endDate;
    public String beginDate;
    
    public String scheduledDate;
    
    public String originalTransactionId;

}
