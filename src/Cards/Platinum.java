package Cards;

import java.util.Date;

import Enums.CardType;

public class Platinum extends Card {

    public Platinum(String pan, Date creationDate, double amount, String ccv, String clabe,
            Date expiration, Date lastTransaction, CardType cardType) {
        super(pan, creationDate, 150000, amount, ccv, clabe, expiration, lastTransaction, cardType);
    }

}
