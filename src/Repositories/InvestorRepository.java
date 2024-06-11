package Repositories;

import Entities.Investor;
import Entities.User;
import Utilities.DateFormatter;

public class InvestorRepository {

    public static void printInvestors() {
        int index = 0;
        System.out.printf(
                "------------------------------------------------------------------------------\n");
        System.out.printf(
                "|                                   Investors                                |\n");
        System.out.printf(
                "------------------------------------------------------------------------------\n");
        System.out.printf("| %18s | %20s | %8s | %13s | %13s | %3s |\n", "Name", "Last name", "Birthday", "Curp",
                "Branch", "i");
        System.out.printf(
                "-------------------------------------------------------------------\n");
        for (User user : UserRepository.getUsers()) {
            if (user instanceof Investor) {
                Investor investor = (Investor) user;
                System.out.printf("| %18s | %20s | %8s | %13s | %13s | %3s |\n", investor.getProfile().getName(),
                        investor.getProfile().getLastname(),
                        DateFormatter.Formatt(investor.getProfile().getBirthDay()), investor.getProfile().getCurp(),
                        investor.getProfile().getBranch(),
                        String.valueOf(index));
            }
            index++;
        }
        System.out.printf(
                "-------------------------------------------------------------------\n\n");
    }

}
