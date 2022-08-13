package com.bernardawj.bbank.base.util;

import com.bernardawj.bbank.credit.facility.enumeration.LoanType;

public class CreditCalculator {

    /**
     * <p>
     *     This method is used to calculate the credit limit of the user based on annual salary.
     *     The credit limit allowed will be 15%/20% of your annual salary CAR/HOME
     * </p>
     *
     * @param annualSalary The annual salary used to calculate the credit limit
     * @param type The type of loan
     * @return Credit limit that was calculated by the system
     */
    public static Double calculateCreditLimit(Double annualSalary, LoanType type) {
        double percentage = 0;

        switch (type) {
            case CAR:
                percentage = 0.15;
                break;
            case HOME:
                percentage = 0.2;
                break;
        }

        return annualSalary * percentage;
    }

}
