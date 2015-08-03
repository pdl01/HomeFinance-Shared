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
public class OnlineTransaction extends RegisterTransaction implements Cloneable{
  
    protected boolean matches;
    protected boolean processedForCategories;
    protected boolean processedForMatches;

    public boolean isMatches() {
        return matches;
    }

    public void setMatches(boolean matches) {
        this.matches = matches;
    }

    public boolean isProcessedForCategories() {
        return processedForCategories;
    }

    public void setProcessedForCategories(boolean processedForCategories) {
        this.processedForCategories = processedForCategories;
    }

    public boolean isProcessedForMatches() {
        return processedForMatches;
    }

    public void setProcessedForMatches(boolean processedForMatches) {
        this.processedForMatches = processedForMatches;
    }
    

    
    
}
