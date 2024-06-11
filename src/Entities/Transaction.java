package Entities;

import java.util.Date;
import Enums.Branch;

public class Transaction {

    private String id;
    private String type;
    private Client client;
    private Date transactionDate;
    private Branch branch;

    public Transaction(String id, String type, Client client, Date transactionDate, Branch branch) {
        this.id = id;
        this.type = type;
        this.client = client;
        this.transactionDate = transactionDate;
        this.branch = branch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

}
