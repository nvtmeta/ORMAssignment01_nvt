package fa.training;

import fa.training.dao.EmployeeDao;
import fa.training.dao.impl.EmployeeDaoImpl;
import fa.training.entities.Employee;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

//        create new employee
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        Employee employee = new Employee( "Nguyen", "Minh");

        employeeDao.save(employee);


        System.out.println(employeeDao.findAll());
    }
}