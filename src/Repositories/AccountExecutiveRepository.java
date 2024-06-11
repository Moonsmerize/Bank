package Repositories;

import Entities.AccountExecutive;
import Entities.User;
import Enums.Branch;
import Utilities.DateFormatter;

public class AccountExecutiveRepository {

        public static void removeAccountExecutive(int index, Branch branch) {
                if (UserRepository.getUsers().get(index).getProfile().getBranch().equals(branch)) {
                        UserRepository.getUsers().remove(index);
                } else {
                        System.out.println("Something went wrong!!!");
                }

        }

        public static void printAccountExecutives(Branch branch) {
                int index = 0;
                System.out.printf(
                                "------------------------------------------------------------------------------\n");
                System.out.printf(
                                "|                              Account Executives                            |\n");
                System.out.printf(
                                "------------------------------------------------------------------------------\n");
                System.out.printf("| %18s | %20s | %8s | %13s | %13s | %3s |\n", "Name", "Last name", "Birthday",
                                "Curp",
                                "Branch", "i");
                System.out.printf(
                                "-------------------------------------------------------------------\n");
                for (User user : UserRepository.getUsers()) {
                        if (user instanceof AccountExecutive && user.getProfile().getBranch().equals(branch)) {
                                AccountExecutive executive = (AccountExecutive) user;
                                System.out.printf("| %18s | %20s | %8s | %13s | %13s | %3s |\n",
                                                executive.getProfile().getName(),
                                                executive.getProfile().getLastname(),
                                                DateFormatter.Formatt(executive.getProfile().getBirthDay()),
                                                executive.getProfile().getCurp(),
                                                executive.getProfile().getBranch(),
                                                String.valueOf(index));
                        }
                        index++;
                }
                System.out.printf(
                                "-------------------------------------------------------------------\n\n");
        }

}
