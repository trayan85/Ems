package org.trayan.service.impl;

import org.trayan.repository.EmployeeRepository;
import org.trayan.repository.data.Employee;
import org.trayan.repository.impl.EmployeeRepositoryImpl;
import org.trayan.service.EmployeeService;

import java.math.BigDecimal;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public Employee addEmployee(final String name, final String department, final BigDecimal salary) {
        return employeeRepository.addEmployee(name, department, salary);
    }
}
