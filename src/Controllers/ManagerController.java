package Controllers;

import java.util.Date;
import Entities.EmployeeProfile;
import Entities.Manager;
import Entities.Profile;
import Enums.Branch;
import Enums.Rol;
import Interfaces.Controller;
import Repositories.UserRepository;
import Utilities.ConsoleReader;

@SuppressWarnings("deprecation")
public class ManagerController implements Controller {

    public void createManager(Branch branch) {
        System.out.println("Manager info");
        String name = ConsoleReader.inputString("Name");
        String lastname = ConsoleReader.inputString("lastname");
        int day = ConsoleReader.inputInteger("Day of birth");
        int month = ConsoleReader.inputInteger("Month of birth");
        int year = ConsoleReader.inputInteger("Year of birth");
        Date birthDay = new Date(year, month, day);
        String city = ConsoleReader.inputString("City");
        String state = ConsoleReader.inputString("State");
        String rfc = ConsoleReader.inputString("RFC");
        String curp = ConsoleReader.inputString("Curp");
        String address = ConsoleReader.inputString("Addres");

        double salary = ConsoleReader.inputDouble("Salary");
        String username = ConsoleReader.inputString("Username");
        String password = ConsoleReader.inputString("Password");
        System.out.println("Starting date");
        int day1 = ConsoleReader.inputInteger("Day");
        int month1 = ConsoleReader.inputInteger("Month");
        int year1 = ConsoleReader.inputInteger("Year");
        Date startingDate = new Date(year1, month1, day1);
        Profile profile = new Profile(name, lastname, birthDay, city, state, rfc, curp, address, branch);
        EmployeeProfile employeeProfile = new EmployeeProfile(salary, Rol.Manager, startingDate);
        Manager Manager = new Manager(profile, username, password, employeeProfile);
        UserRepository.getUsers().add(Manager);
    }

    @Override
    public void execute(Branch branch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
