package org.example.springRESTExample2.payroll;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;


/**
 *
 ** @Entity is a JPA annotation to make this object ready for storage in a JPA-based data store.
 */

@Getter
@Setter
@ToString
@Entity
public class Employee {
    private @Id
    @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String role;

    Employee() {}

    public Employee(String firstName, String lastname, String role) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.role = role;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }
}
