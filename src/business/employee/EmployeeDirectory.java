/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 * @author Aelina
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }

    public void deleteEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
