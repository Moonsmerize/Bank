package Utilities;

import Entities.MenuItem;
import Entities.*;
import Interfaces.Controller;
import Repositories.UserRepository;
import Controllers.*;

public class Main {

    static int logoutValidator;
    static int userIndex;

    public static void main(String[] args) {
        Seeder.initialize();
        System.out.println("\n");
        boolean shutdown = false;
        byte loggingAttempts = 0;
        Menu mainMenu = new Menu();
        Controller accountExecutiveController = new AccountExecutiveController();
        Controller capturistController = new CapturistController();
        Controller clientController = new ClientController();
        Controller investorController = new InvestorController();
        Controller managerController = new ManagerController();
        Controller transactionController = new TransactionController();
        Controller logoutController = new Logout();

        do {
            String username = ConsoleReader.inputString("Username");
            String password = ConsoleReader.inputString("Password");
            if (Login.login(username, password) != null) {
                loggingAttempts = 0;
                logoutValidator = -1;
                User user = Login.login(username, password);
                System.out.println("\nWelcome " + user.getUsername() + "\n");
                mainMenu.addMenuItem(0, new MenuItem("Logout", logoutController));
                if (user instanceof Client) {
                    // Client client = (Client) user;
                    userIndex = UserRepository.getUsers().indexOf(user);
                    mainMenu.addMenuItem(1, new MenuItem("Transactions Menu", transactionController));
                } else if (user instanceof Manager) {
                    // Manager manager = (Manager) user;
                    userIndex = UserRepository.getUsers().indexOf(user);
                    mainMenu.addMenuItem(1, new MenuItem("Account Executives Menu", accountExecutiveController));
                    mainMenu.addMenuItem(2, new MenuItem("Capturists Menu", capturistController));
                    mainMenu.addMenuItem(3, new MenuItem("Client Menu", clientController));
                    mainMenu.addMenuItem(4, new MenuItem("Investors Menu", investorController));
                    mainMenu.addMenuItem(5, new MenuItem("Managers Menu", managerController));
                    mainMenu.addMenuItem(6, new MenuItem("Transactions Menu", transactionController));
                } else if (user instanceof AccountExecutive) {
                    mainMenu.addMenuItem(1, new MenuItem("Account Executives Menu", accountExecutiveController));
                } else if (user instanceof Capturist) {
                    mainMenu.addMenuItem(1, new MenuItem("Account Executives Menu", capturistController));
                } else if (user instanceof Investor) {

                }
                do {
                    mainMenu.display("Main Menu");
                } while (logoutValidator != 0);
                user = null;
                mainMenu.getMenuItems().clear();
                System.out.println("\nYou logged out\n");
                ConsoleReader.bufferCleaner();
                shutdown = !ConsoleReader.inputBoolean("Login again?");
                ConsoleReader.bufferCleaner();
            } else if (loggingAttempts < 2) {
                System.out.println("Username o password incorrect!! try again\n");
            } else {
                System.out.println("\nSYSTEM LOCKED!!!");
                shutdown = true;
            }
            loggingAttempts++;
        } while (!shutdown);

    }

}
