package com.Casey;

/**
 * Created by casey on 2/24/15.
 */
import java.util.*;
public class WaterHeater extends ServiceCall{

    protected Integer ageYears;
    protected String resDescription;
    protected double fee;
    protected static double mandFee = 20.00;
    protected Date resolvedDate;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, int ageYears, Date resolvedDate, String resDescription, double fee) {
        super(serviceAddress, problemDescription, date);
        this.resolvedDate = resolvedDate;
        this.ageYears = ageYears;
        this.resDescription = resDescription;
        this.fee = fee;
    }

    @Override
    public String toString() {
        String serviceAddressString = (serviceAddress == null) ? "Unresolved" : this.serviceAddress;
        String problemDescriptionString = (problemDescription == null) ? "Unresolved" : this.problemDescription;
        String reportedDateString = (reportedDate == null) ? "Unresolved" : this.reportedDate.toString();
        String ageYearsString = (ageYears == null) ? "Unresolved" : this.ageYears.toString();
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resDescription == null) ? "Unresolved" : this.resDescription;
        String feeString = (fee == fee + mandFee) ? "Unresolved" : "$" + Double.toString(fee);

        return "Water Heater Service Call" + "\n" +
                "Service Address= " + serviceAddressString + "\n" +
                "Problem Description = " + problemDescriptionString  + "\n" +
                "Reported Date = " + reportedDateString + "\n" +
                "Age of heater = " + ageYearsString + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString;
    }
}
