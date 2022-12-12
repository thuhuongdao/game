package helitech.dao.mapping;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class Employee implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private int salary;

    public Employee(String firstName, String lastName, Date birthday, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.salary = salary;
    }
}
