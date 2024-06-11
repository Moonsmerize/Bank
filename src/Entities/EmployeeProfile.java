package Entities;

import java.util.Date;

import Enums.Rol;

public class EmployeeProfile {

    private double salary;
    private Rol rol;
    private Date startDate;

    public EmployeeProfile(double salary, Rol rol, Date startDate) {
        this.salary = salary;
        this.rol = rol;
        this.startDate = startDate;
    }

    public EmployeeProfile(double salary, Date startDate) {
        this.salary = salary;
        this.startDate = startDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
