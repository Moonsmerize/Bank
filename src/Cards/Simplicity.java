package Cards;

import java.util.Date;

import Enums.CardType;

public class Simplicity extends Card {

    public Simplicity(String pan, Date creationDate, double amount, String ccv, String clabe,
            Date expiration, Date lastTransaction, CardType cardType) {
        super(pan, creationDate, 60000, amount, ccv, clabe, expiration, lastTransaction, cardType);
    }

}
