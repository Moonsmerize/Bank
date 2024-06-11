package Cards;

import java.util.Date;

import Enums.CardType;

public class Debit extends Card {

    public Debit(String pan, Date creationDate, double amount, String ccv, String clabe,
            Date expiration, Date lastTransaction, CardType cardType) {
        super(pan, creationDate, Double.MAX_VALUE, amount, ccv, clabe, expiration, lastTransaction,
                cardType);
    }

}
