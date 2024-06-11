package Entities;

public class Employee extends User {

    private EmployeeProfile employeeProfile;

    public Employee(Profile profile, String username, String password, EmployeeProfile employeeProfile) {
        super(profile, username, password);
        this.employeeProfile = employeeProfile;
    }

    public EmployeeProfile getEmployeeProfile() {
        return employeeProfile;
    }

    public void setEmployeeProfile(EmployeeProfile employeeProfile) {
        this.employeeProfile = employeeProfile;
    }

}
