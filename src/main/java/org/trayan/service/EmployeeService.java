package org.trayan.service;

import org.trayan.repository.data.Employee;

import java.math.BigDecimal;

public interface EmployeeService {

    // Note:
    // an EmployeeExternal object can be passed as input param and be mapped to the Employee object in the Repository layer with MapStruct
    Employee addEmployee(final String name, final String department, final BigDecimal salary);
}
