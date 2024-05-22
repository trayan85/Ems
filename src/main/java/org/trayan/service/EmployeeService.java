package org.trayan.service;

import org.trayan.repository.data.Employee;

import java.math.BigDecimal;

public interface EmployeeService {

    // Note: an EmployeeExternal object can come from an another service and be mapped to the Employee DTO in the Repository layer with MapStruct
    Employee addEmployee(final Long id, final String name, final String department, final BigDecimal salary);
}
