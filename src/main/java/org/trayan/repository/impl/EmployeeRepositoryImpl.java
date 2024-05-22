package org.trayan.repository.impl;

import org.trayan.repository.EmployeeRepository;
import org.trayan.repository.data.Employee;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private ConcurrentHashMap<Long, Employee> mapEmployees = new ConcurrentHashMap<>();

    /* Note:
    2nd variant for Concurrent protection

    private ReentrantLock lock = new ReentrantLock();

    operationMethod() {
        final boolean isLockAcquired = lock.tryLock(1, SECONDS);

        if(isLockAcquired) {
            try {
                // operation on the employees Collection
            } finally {
                lock.unlock();
            }
     */

    @Override
    public Employee addEmployee(final Long id, final String name, final String department, final BigDecimal salary) {
        final Employee employee = new Employee(id, name, department, salary);
        return mapEmployees.putIfAbsent(id, employee);
    }
}
