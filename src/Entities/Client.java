package Entities;

import java.util.ArrayList;

import Cards.Card;

public class Client extends User {

    ArrayList<Card> cards;

    public Client(Profile profile, String username, String password) {
        super(profile, username, password);
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCard(ArrayList<Card> cards) {
        this.cards = cards;
    }

}
