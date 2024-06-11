package Cards;

import java.util.Date;

import Enums.CardType;

public class Gold extends Card {

    public Gold(String pan, Date creationDate, double amount, String ccv, String clabe,
            Date expiration, Date lastTransaction, CardType cardType) {
        super(pan, creationDate, 40000, amount, ccv, clabe, expiration, lastTransaction, cardType);
    }

}
