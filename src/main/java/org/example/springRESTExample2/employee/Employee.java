package org.example.springRESTExample2.employee;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private  Long id;
    private String name;
    private String mobileNo;
    private Long salary;

    public Employee() {
    }

    public Employee(Long id, String name, String mobileNo, Long salary) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.salary = salary;
    }

}
