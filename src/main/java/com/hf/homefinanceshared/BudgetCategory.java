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
public class BudgetCategory extends CategorySplit{
    protected int[] activePeriods;  //if populated what months the budgetItem is active in; if unpopulated active in all months

    public int[] getActivePeriods() {
        return activePeriods;
    }

    public void setActivePeriods(int[] activePeriods) {
        this.activePeriods = activePeriods;
    }

}
    