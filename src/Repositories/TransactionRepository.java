package Repositories;

import java.util.ArrayList;
import java.util.UUID;
import Entities.Transaction;
import Enums.Branch;

public class TransactionRepository {

        public static ArrayList<Transaction> transactions = new ArrayList<>();

        public static void printTransactions() {
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                System.out.printf(
                                "|                                                       Transactions                                                     |\n");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                System.out.printf("| %36s | %6s | %20s | %28s |\n", "ID", "Type", "Client",
                                "Date");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                for (Transaction transaction : transactions) {
                        System.out.printf("| %36s | %6s | %20s | %28s |\n", transaction.getId(),
                                        transaction.getType(),
                                        transaction.getClient().getProfile().getName() + " "
                                                        + transaction.getClient().getProfile().getLastname(),
                                        transaction.getTransactionDate());
                }
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n\n");
        }

        public static ArrayList<Transaction> getTransactions() {
                return transactions;
        }

        public static void setTransactions(ArrayList<Transaction> transactions) {
                TransactionRepository.transactions = transactions;
        }

        public static String generateUIDD() {
                UUID uuid = UUID.randomUUID();
                String uuidAsString = uuid.toString();
                return uuidAsString;
        }

        public static void printAcueductoTransactions() {
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                System.out.printf(
                                "|                                                       Transactions                                                     |\n");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                System.out.printf("| %36s | %6s | %20s | %28s |\n", "ID", "Type", "Client",
                                "Date");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                for (Transaction transaction : transactions) {
                        if (transaction.getBranch() == Branch.Madero) {

                        }
                        System.out.printf("| %36s | %6s | %20s | %28s |\n", transaction.getId(),
                                        transaction.getType(),
                                        transaction.getClient().getProfile().getName() + " "
                                                        + transaction.getClient().getProfile().getLastname(),
                                        transaction.getTransactionDate());
                }
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n\n");
        }

        public static void printMaderoTransactions() {
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                System.out.printf(
                                "|                                                       Transactions                                                     |\n");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                System.out.printf("| %36s | %6s | %20s | %28s |\n", "ID", "Type", "Client",
                                "Date");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n");
                for (Transaction transaction : transactions) {
                        if (transaction.getBranch() == Branch.Acueducto) {

                        }
                        System.out.printf("| %36s | %6s | %20s | %28s |\n", transaction.getId(),
                                        transaction.getType(),
                                        transaction.getClient().getProfile().getName() + " "
                                                        + transaction.getClient().getProfile().getLastname(),
                                        transaction.getTransactionDate());
                }
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------------------------------\n\n");
        }

        // public void withdraw(double amount, Client client) {

        // if (amount < 0 || amount > checkCurrentBalance(client)) {
        // System.out.println("No es posible hacer esa operacion ");
        // } else {
        // Transaction transaction = new Transaction(amount * -1);
        // transactions.add(transaction);
        // }

        // }

        // public double checkCurrentBalance(Client client,Card card) {
        // double totalAmount = 0;
        // for (Transaction transaction : transactions) {
        // if (transaction.getType().equals("deposit") ||
        // transaction.getType().equals("withdraw")) {
        // totalAmount += client.ge;
        // }
        // }
        // return
        // }

        // public void deposit(double amount) {
        // if (amount <= 0) {
        // System.out.println("cantidad no valida");
        // } else {
        // Transaction transaction = new Transaction(amount);
        // transactions.add(transaction);
        // }
        // }

}
