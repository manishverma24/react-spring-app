package com.reactspringbootdemo.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.StringJoiner;

/**
 * @author manish on 09/10/20
 */
@Document("Employee")
public class Employee {

    @Id
    private int id;
    private String name;
    private String department;
    private String gender;

    public Employee() {}

    public Employee(int id, String name, String department, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("department='" + department + "'")
                .add("gender='" + gender + "'")
                .toString();
    }
}
