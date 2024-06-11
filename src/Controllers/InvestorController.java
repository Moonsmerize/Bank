package Controllers;

import java.util.Date;

import Entities.Investor;
import Entities.Profile;
import Enums.Branch;
import Interfaces.Controller;
import Repositories.UserRepository;
import Utilities.ConsoleReader;

@SuppressWarnings("deprecation")
public class InvestorController implements Controller {

    public void createinvestor() {
        System.out.println("Investor info");
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
        Branch branch = Branch.getBrach();
        String username = ConsoleReader.inputString("Username");
        String password = ConsoleReader.inputString("Password");
        System.out.println("Starting date");
        Profile profile = new Profile(name, lastname, birthDay, city, state, rfc, curp, address, branch);
        Investor investor = new Entities.Investor(profile, username, password);
        UserRepository.getUsers().add(investor);
    }

    @Override
    public void execute(Branch branch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }

}
