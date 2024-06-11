package Entities;

import java.util.Date;

import Enums.Branch;

public class Profile {

    private String name;
    private String lastname;
    Date birthDay;
    private String city;
    private String state;
    private String rfc;
    private String curp;
    private String address;
    private Branch branch;

    public Profile(String name, String lastname, Date birthDay, String city, String state, String rfc, String curp,
            String address, Branch branch) {
        this.name = name;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.city = city;
        this.state = state;
        this.rfc = rfc;
        this.curp = curp;
        this.address = address;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

}
