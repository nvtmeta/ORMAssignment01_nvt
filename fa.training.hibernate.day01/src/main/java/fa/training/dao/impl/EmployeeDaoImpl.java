package fa.training.dao.impl;

import fa.training.dao.EmployeeDao;
import fa.training.entities.Employee;
import fa.training.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void save(Employee employee) {
        Session session = HibernateUtils.getCurrentSession();

        session.beginTransaction();

        session.persist(employee);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Iterable<Employee> findAll() {
        Session session = HibernateUtils.getCurrentSession();
        session.beginTransaction();

        Iterable<Employee> employee = session.createQuery("from Employee", Employee.class).list();
        session.getTransaction().commit();
        return (Iterable<Employee>) employee;
    }
}
