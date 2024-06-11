package Repositories;

import Entities.Manager;
import Entities.User;
import Utilities.DateFormatter;

public class ManagerRepository {

        public static void printManagers() {
                int index = 0;
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------\n");
                System.out.printf(
                                "|                                               Managers                                        |\n");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------\n");
                System.out.printf("| %18s | %20s | %11s | %13s | %13s | %3s |\n", "Name", "Last name", "Birthday",
                                "Curp",
                                "Branch", "i");
                System.out.printf(

                                "-------------------------------------------------------------------------------------------------\n");
                for (User user : UserRepository.getUsers()) {
                        if (user instanceof Manager) {
                                Manager manager = (Manager) user;
                                System.out.printf("| %18s | %20s | %11s | %13s | %13s | %3s |\n",
                                                manager.getProfile().getName(),
                                                manager.getProfile().getLastname(),
                                                DateFormatter.Formatt(manager.getProfile().getBirthDay()),
                                                manager.getProfile().getCurp(),
                                                manager.getProfile().getBranch(),
                                                String.valueOf(index));

                        }
                        index++;
                }
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------\n\n");
        }

}
