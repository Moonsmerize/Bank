package Controllers;

import java.util.Date;
import Entities.*;
import Enums.Branch;
import Enums.Rol;
import Interfaces.Controller;
import Repositories.AccountExecutiveRepository;
import Repositories.ClientRepository;
import Repositories.UserRepository;
import Utilities.ConsoleReader;
import Utilities.Menu;

@SuppressWarnings("deprecation")
public class AccountExecutiveController implements Controller {

    public void createAccountExecutive(Branch branch) {
        System.out.println("Account Executive info");
        ConsoleReader.bufferCleaner();
        String name = ConsoleReader.inputString("Name");
        String lastname = ConsoleReader.inputString("lastname");
        String city = ConsoleReader.inputString("City");
        String state = ConsoleReader.inputString("State");
        String rfc = ConsoleReader.inputString("RFC");
        String curp = ConsoleReader.inputString("Curp");
        String address = ConsoleReader.inputString("Addres");
        String username = ConsoleReader.inputString("Username");
        String password = ConsoleReader.inputString("Password");
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
        EmployeeProfile employeeProfile = new EmployeeProfile(salary, Rol.accountExecutive, startingDate);
        AccountExecutive accountExecutive = new AccountExecutive(profile, username, password, employeeProfile);
        UserRepository.getUsers().add(accountExecutive);
    }

    public void modifyAccountExecutive(Branch branch) {

    }

    public void removeAccountExecutive(Branch branch) {
        AccountExecutiveRepository.printAccountExecutives(branch);
        int index = ConsoleReader.inputInteger("Index");
        AccountExecutiveRepository.removeAccountExecutive(index, branch);
    }

    public AccountExecutive getAccountExecutiveByIndex() {
        int index = ConsoleReader.inputInteger("Index");
        AccountExecutive accountExecutive = (AccountExecutive) UserRepository.getUsers().get(index);
        return accountExecutive;
    }

    @Override
    public void execute(Branch branch) {
        ClientController clientController = new ClientController();
        ConsoleReader.bufferCleaner();
        Menu subMenu = new Menu();
        Controller createClient = (Branch) -> clientController.createClient(branch);
        Controller printClient = (Branch) -> ClientRepository.printClients();
        Controller removeClient = (Branch) -> clientController.removeClient(branch);
        Controller modifyClient = (Branch) -> clientController.modifyClient();

        subMenu.addMenuItem(1, new MenuItem("Create client", createClient));
        subMenu.addMenuItem(2, new MenuItem("Modify client", modifyClient));
        subMenu.addMenuItem(3, new MenuItem("Remove client", removeClient));
        subMenu.addMenuItem(4, new MenuItem("Search client", printClient));

        subMenu.display("Account Executive Menu");
        ConsoleReader.bufferCleaner();
    }
}
