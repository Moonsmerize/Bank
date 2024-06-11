package Cards;

import java.util.Date;

import Enums.CardType;

public class Card {

    private String pan;
    private Date creationDate;
    private double maxAmount;
    private double amount;
    private String ccv;
    private String clabe;
    private Date expiration;
    private Date lastTransaction;
    private CardType cardType;

    public Card(String pan, Date creationDate, double maxAmount, double amount, String ccv, String clabe,
            Date expiration, Date lastTransaction, CardType cardType) {
        this.pan = pan;
        this.creationDate = creationDate;
        this.maxAmount = maxAmount;
        this.amount = amount;
        this.ccv = ccv;
        this.clabe = clabe;
        this.expiration = expiration;
        this.lastTransaction = lastTransaction;
        this.cardType = cardType;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public Date getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(Date lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

}
