package Repositories;

import Entities.Capturist;
import Entities.User;
import Utilities.DateFormatter;

public class CapturistRepository {

        public static void printCapturists() {
                int index = 0;
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------\n");
                System.out.printf(
                                "|                                      Account Executives                                       |\n");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------\n");
                System.out.printf("| %18s | %20s | %11s | %13s | %13s | %3s |\n", "Name", "Last name", "Birthday",
                                "Curp",
                                "Branch", "i");
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------\n");
                for (User user : UserRepository.getUsers()) {
                        if (user instanceof Capturist) {
                                Capturist capturist = (Capturist) user;
                                System.out.printf("| %18s | %20s | %11s | %13s | %13s | %3s |\n",
                                                capturist.getProfile().getName(),
                                                capturist.getProfile().getLastname(),
                                                DateFormatter.Formatt(capturist.getProfile().getBirthDay()),
                                                capturist.getProfile().getCurp(),
                                                capturist.getProfile().getBranch(),
                                                String.valueOf(index));
                        }
                        index++;
                }
                System.out.printf(
                                "-------------------------------------------------------------------------------------------------\n\n");
        }
}
