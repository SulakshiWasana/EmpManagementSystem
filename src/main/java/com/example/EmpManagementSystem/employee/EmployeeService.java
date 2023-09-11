package com.example.EmpManagementSystem.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees(){
        return List.of(
                new Employee(
                        1L,
                        "Sunil",
                        "sunil@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 3),
                        21
                )
        );
    }

}
