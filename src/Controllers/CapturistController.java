package Controllers;

import java.util.Date;

import Entities.Capturist;
import Entities.EmployeeProfile;
import Entities.MenuItem;
import Entities.Profile;
import Enums.Branch;
import Enums.Rol;
import Interfaces.Controller;
import Repositories.UserRepository;
import Utilities.ConsoleReader;
import Utilities.Menu;

@SuppressWarnings("deprecation")
public class CapturistController implements Controller {

    public void createCaputurist(Branch branch) {
        System.out.println("Capturist info");
        ConsoleReader.bufferCleaner();
        String name = ConsoleReader.inputString("Name");
        String lastname = ConsoleReader.inputString("lastname");
        String username = ConsoleReader.inputString("Username");
        String password = ConsoleReader.inputString("Password");
        String city = ConsoleReader.inputString("City");
        String state = ConsoleReader.inputString("State");
        String rfc = ConsoleReader.inputString("RFC");
        String curp = ConsoleReader.inputString("Curp");
        String address = ConsoleReader.inputString("Addres");
        int day = ConsoleReader.inputInteger("Day of birth");
        int month = ConsoleReader.inputInteger("Month of birth");
        int year = ConsoleReader.inputInteger("Year of birth");
        Date birthDay = new Date(year, month, day);
        double salary = ConsoleReader.inputDouble("Salary");
        System.out.println("Starting date");
        int day1 = ConsoleReader.inputInteger("Day");
        int month1 = ConsoleReader.inputInteger("Month");
        int year1 = ConsoleReader.inputInteger("Year");
        Date startingDate = new Date(year1, month1, day1);
        Profile profile = new Profile(name, lastname, birthDay, city, state, rfc, curp, address, branch);
        EmployeeProfile employeeProfile = new EmployeeProfile(salary, Rol.Manager, startingDate);
        Capturist capturist = new Capturist(profile, username, password, employeeProfile);
        UserRepository.getUsers().add(capturist);
    }

    public void removeCapturist(int index, Branch branch) {
        if (UserRepository.getUsers().get(index).getProfile().getBranch().equals(branch)) {
            UserRepository.getUsers().remove(index);
        } else {
            System.out.println("Something went wrong!!!");
        }
    }

    @Override
    public void execute(Branch branch) {
        AccountExecutiveController accountExecutiveController = new AccountExecutiveController();
        ConsoleReader.bufferCleaner();
        Menu subMenu = new Menu();
        Controller createAccountExecutive = (Branch) -> accountExecutiveController.createAccountExecutive(branch);
        Controller modifyAccountExecutive = (Branch) -> accountExecutiveController.modifyAccountExecutive(branch);

        subMenu.addMenuItem(1, new MenuItem("Create capturist", createAccountExecutive));
        subMenu.addMenuItem(2, new MenuItem("Modify capturist", modifyAccountExecutive));

        subMenu.display("Capturist Menu");

    }

}
