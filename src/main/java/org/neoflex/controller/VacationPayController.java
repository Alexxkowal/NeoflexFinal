package org.neoflex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.neoflex.service.VacationPayService;

@RestController
@RequestMapping("/calculate")
public class VacationPayController {
    private final VacationPayService vacationPayService;

    public VacationPayController(VacationPayService vacationPayService) {
        this.vacationPayService = vacationPayService;
    }

    @GetMapping
    public ResponseEntity<Double> calculateVacationPay(
            @RequestParam double averageSalary,
            @RequestParam int vacationDays
    ) {
        double result = vacationPayService.calculate(averageSalary, vacationDays);
        return ResponseEntity.ok(result);
    }
}