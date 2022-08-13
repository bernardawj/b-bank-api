package com.bernardawj.bbank.creditfacility.util;

public class CreditCalculator {

    /**
     * <p>
     *     This method is used to calculate the credit limit of the user based on annual salary.
     *     The credit limit allowed will be 20% of your annual salary
     * </p>
     *
     * @param annualSalary The annual salary used to calculate the credit limit
     * @return Credit limit that was calculated by the system
     */
    public static Double calculateCreditLimit(Double annualSalary) {
        return annualSalary * 0.2;
    }

}
