package org.trayan.repository;

import org.trayan.repository.data.Employee;

import java.math.BigDecimal;

public interface EmployeeRepository {

    Employee addEmployee(Long id, String name, String department, BigDecimal salary);
}
