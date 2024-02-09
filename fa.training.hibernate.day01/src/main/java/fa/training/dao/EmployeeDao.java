package fa.training.dao;

import fa.training.entities.Employee;

public interface EmployeeDao {

    void save(Employee employee);

    Iterable<Employee> findAll();
}
