package Repositories;

import Cards.Card;
import Entities.Client;
import Entities.User;
import Utilities.DateFormatter;

public class CardsRepository {

    public static void printClientCards(User user) {
        System.out.printf(
                "---------------------------------------------------------------------------------------------------\n");
        System.out.printf(
                "|                                                Admins                                           |\n");
        System.out.printf(
                "---------------------------------------------------------------------------------------------------\n");
        System.out.printf("| %18s | %20s | %13s | %13s |\n", "Name", "Last name", "Birthday", "Cards");

        System.out.printf(
                "---------------------------------------------------------------------------------------------------\n");
        Client client = (Client) user;
        System.out.printf("| %18s | %20s | %13s | %13s |\n", client.getProfile().getName(),
                client.getProfile().getLastname(),
                DateFormatter.Formatt(client.getProfile().getBirthDay()), "");
        for (Card card : client.getCards()) {
            System.out.println(card);
        }
        System.out.printf(
                "---------------------------------------------------------------------------------------------------\n");

    }

}
