package org.example.springRESTExample2.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
    private static final Map<Long, Employee> employees = new HashMap<>();
    private static Long index=2L;

    static {
        Employee employee1= new Employee(1L, "emp1", "3411463147", 2000L);
        Employee employee2= new Employee(2L, "emp2", "3411223456", 2000L);
        employees.put(1L,employee1);
        employees.put(2L,employee2);
    }

    public static List<Employee> getAllEmployees(){
        return  new ArrayList<>(employees.values());
    }

    public static Employee getEmployeeDetails(Long employeeId){
        return employees.get(employeeId);
    }

    public static Employee addEmployee(Employee employee){
        index+=1;
        employee.setId(index);
        employees.put(index,employee);
        return employee;
    }

    public static Employee updateEmployee(Long employeeId, Employee employee){
        employee.setId(employeeId);
        employees.put(employeeId,employee);
        return employee;
    }

    public static Employee deleteEmployee(Long employeeId)
    {
        return employees.remove(employeeId);
    }
}
