package Repositories;

import java.util.ArrayList;

import Cards.Card;
import Utilities.DateFormatter;

import Entities.Client;
import Entities.User;
import Enums.Branch;

public class ClientRepository {

    private static ArrayList<Client> clients = new ArrayList<>();

    public static void createClient(Client client) {
        clients.add(client);
    }

    public static void deleteClient(Client client, Branch branch) {
        if (client.getProfile().getBranch().equals(branch)) {
            clients.remove(client);
        } else {
            System.out.println("Something went wrong!!!");
        }

    }

    public static void modifyClient(Client client) {

    }

    public static Client getClientByIndex(int index) {
        return clients.get(index);
    }

    public static void printClients() {
        int index = 0;
        System.out.printf(
                "--------------------------------------------------------------------------------------------\n");
        System.out.printf(
                "|                                          Clients                                         |\n");
        System.out.printf(
                "--------------------------------------------------------------------------------------------\n");
        System.out.printf("| %18s | %20s | %11s | %13s | %8s | %3s |\n", "Name", "Last name", "Birthday", "Curp",
                "Cards",
                "i");
        System.out.printf(
                "--------------------------------------------------------------------------------------------\n");
        for (User user : UserRepository.getUsers()) {
            if (user instanceof Client) {
                Client client = (Client) user;
                System.out.printf("| %18s | %20s | %11s | %13s | %8s | %3s |\n", client.getProfile().getName(),
                        client.getProfile().getLastname(),
                        DateFormatter.Formatt(client.getProfile().getBirthDay()), client.getProfile().getCurp(), "",
                        String.valueOf(index));
                for (Card card : client.getCards()) {
                    System.out.printf("| %18s | %20s | %11s | %13s | %8s | %3s |\n", "", "", "", "", card.getCardType(),
                            "");
                }
                System.out.printf(
                        "--------------------------------------------------------------------------------------------\n");
            }
            index++;
        }

    }

    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static void setClients(ArrayList<Client> clients) {
        ClientRepository.clients = clients;
    }

}
