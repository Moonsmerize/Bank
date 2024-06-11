package Controllers;

import Utilities.ConsoleReader;
import Utilities.Generator;
import java.util.Date;
import Cards.Debit;
import Entities.*;
import Enums.Branch;
import Enums.CardType;
import Interfaces.Controller;
import Repositories.ClientRepository;

@SuppressWarnings("deprecation")
public class ClientController implements Controller {

    public void createClient(Branch branch) {
        System.out.println("Client info");
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
        String username = ConsoleReader.inputString("Username");
        String password = ConsoleReader.inputString("Password");
        Profile profile = new Profile(name, lastname, birthDay, city, state, rfc, curp, address, branch);
        System.out.println("Debit card info");
        double amount = ConsoleReader.inputDouble("Start amount");
        String pan = Generator.generatePan();
        Debit card = new Debit(pan, new Date(), amount, Generator.generateCcv(), Generator.clabeGenerator(branch, pan),
                new Date(), new Date(), CardType.Debit);
        Client client = new Client(profile, username, password);
        client.getCards().add(card);
        ClientRepository.createClient(client);
    }

    public void removeClient(Branch branch) {
        ClientRepository.printClients();
        int index = ConsoleReader.inputInteger("Client's index");
        Client client = ClientRepository.getClientByIndex(index);
        ClientRepository.deleteClient(client, branch);
    }

    public void modifyClient() {
        ClientRepository.printClients();
        int index = ConsoleReader.inputInteger("Client's index");
        Client client = ClientRepository.getClientByIndex(index);
        client.getProfile().setName(null);
    }

    @Override
    public void execute(Branch branch) {
        // AskData.bufferCleaner();
        // Menu subMenu = new Menu();
        // Controller borrowABook = (permission) -> borrowABook();
        // Controller returnABook = (permission) -> retrurnABook();
        // Controller printTransactions = (permission) -> printTransactions();
        // Controller printTransactionByClient = (permission) ->
        // TransactionRepository.printTransactionsByClient();

        // if (ClientRepository.getUsers().get(Main.userIndex) instanceof Client) {
        // subMenu.addMenuItem(1, new MenuItem("Print Transactions done",
        // printTransactionByClient));
        // } else {
        // subMenu.addMenuItem(1, new MenuItem("Borrow a Book", borrowABook));
        // subMenu.addMenuItem(2, new MenuItem("Return a Book", returnABook));
        // subMenu.addMenuItem(3, new MenuItem("Print Transactions",
        // printTransactions));
        // }

        // subMenu.display("Transactions Menu", permissions);
    }

}
