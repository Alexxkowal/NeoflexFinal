package org.neoflex.service;

import org.springframework.stereotype.Service;

@Service
public class VacationPayService {

    private static final double AVERAGE_DAYS_IN_MONTH = 29.3;

    public double calculate(double averageSalary, int vacationDays) {
        double dailyPay = averageSalary / AVERAGE_DAYS_IN_MONTH;
        return Math.round(dailyPay * vacationDays * 100.0) / 100.0;
    }
}