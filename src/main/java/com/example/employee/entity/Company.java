package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Company {
    @Id
    private int id;
    private String companyName;
    private int employee;

    public Company(int id, String companyName, int employee) {
        this.id = id;
        this.companyName = companyName;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", employee=" + employee +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getEmployee() {
        return employee;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }
}
