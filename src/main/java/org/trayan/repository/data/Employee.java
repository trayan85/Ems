package org.trayan.repository.data;

import java.math.BigDecimal;

public class Employee {

    private Long id;

    private String name;

    private String department;

    private BigDecimal salary;


    public Employee() {}

    public Employee(final Long id, final String name, final String department, final BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + id.hashCode();
        result = prime * result + name.hashCode();
        result = prime * result + department.hashCode();
        result = prime * result + salary.hashCode();
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;

        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;

        if (!id.equals(other.id)) return false;
        if (!name.equals(other.name)) return false;
        if (!department.equals(other.department)) return false;
        if (!salary.equals(other.salary)) return false;

        return true;
    }
}
