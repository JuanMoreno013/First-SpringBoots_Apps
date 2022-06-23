package org.example.springRESTExample2.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return EmployeeService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployeeDetails(@PathVariable Long employeeId){
        return EmployeeService.getEmployeeDetails(employeeId);
    }

    @PostMapping ("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return EmployeeService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee/{employeeId}")
    public Employee updateEmployee(@PathVariable Long employeeId, @RequestBody Employee employee){
        return EmployeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/deleteEmployee/{employeeId}")
    public Employee deleteEmployee(@PathVariable Long employeeId){
        return EmployeeService.deleteEmployee(employeeId);
    }


}
