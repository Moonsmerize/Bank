package Utilities;

import java.util.Date;

import Cards.*;
import Entities.EmployeeProfile;
import Entities.*;
import Entities.Profile;
import Enums.Branch;
import Enums.CardType;
import Repositories.AccountExecutiveRepository;
import Repositories.CapturistRepository;
import Repositories.ClientRepository;
import Repositories.ManagerRepository;
import Repositories.TransactionRepository;
import Repositories.UserRepository;

@SuppressWarnings("deprecation")
public class Seeder {
        public static void initialize() {
                System.out.println("\n");

                // Manager
                Profile profile1 = new Profile("ManagerName1", "ManagerLastname1", new Date(1971 - 1900, 4, 19),
                                "Morelia", "Michoacan", "1234", "1234", "Verde #90", Branch.Madero);
                Profile profile2 = new Profile("ManagerName2", "ManagerLastname2", new Date(1981 - 1900, 4, 19),
                                "Morelia", "Michoacan", "4321", "4321", "Verde #50", Branch.Acueducto);
                EmployeeProfile employeeProfile1 = new EmployeeProfile(10000, new Date(1990 - 1900, 1, 03));
                EmployeeProfile employeeProfile2 = new EmployeeProfile(10001, new Date(1990 - 1900, 1, 03));
                Manager manager1 = new Manager(profile1, "manager1", "manager1", employeeProfile1);
                Manager manager2 = new Manager(profile2, "manager2", "manager2", employeeProfile2);
                UserRepository.getUsers().add(manager1);
                UserRepository.getUsers().add(manager2);

                // Capturist
                Profile profile3 = new Profile("Capturist1", "CapturistLastname1", new Date(1971 - 1900, 4, 19),
                                "Morelia", "Michoacan", "12345", "12345", "Amarillo #91", Branch.Madero);
                Profile profile4 = new Profile("Capturist1", "CapturistLastname1", new Date(1971 - 1900, 4, 19),
                                "Morelia", "Michoacan", "54321", "54321", "Amarillo #90", Branch.Acueducto);
                EmployeeProfile employeeProfile3 = new EmployeeProfile(10002, new Date(1990 - 1900, 1, 03));
                EmployeeProfile employeeProfile4 = new EmployeeProfile(10003, new Date(1990 - 1900, 1, 03));
                Capturist capturist1 = new Capturist(profile3, "capturist1", "capturist1", employeeProfile3);
                Capturist capturist2 = new Capturist(profile4, "capturist2", "capturist2", employeeProfile4);
                UserRepository.getUsers().add(capturist1);
                UserRepository.getUsers().add(capturist2);

                // Clients
                Profile profile5 = new Profile("Client1", "ClientLastname1", new Date(1971 - 1900, 4, 19), "Morelia",
                                "Michoacan", "123456", "123456", "Azul #81", Branch.Madero);
                Profile profile6 = new Profile("Client2", "ClientLastname2", new Date(1971 - 1900, 4, 19), "Morelia",
                                "Michoacan", "654321", "654321", "Azul #80", Branch.Acueducto);
                Client client1 = new Client(profile5, "client1", "client1");
                Client client2 = new Client(profile6, "client2", "client2");
                UserRepository.getUsers().add(client1);
                UserRepository.getUsers().add(client2);

                // Cards
                Debit debit1 = new Debit("123", new Date(1990 - 1900, 1, 07), 100, "534", "41241",
                                new Date(1990 - 1900, 1, 03), new Date(1990 - 1900, 1, 03), CardType.Debit);
                Debit debit2 = new Debit("123", new Date(1990 - 1900, 1, 07), 100, "534", "41241",
                                new Date(1990 - 1900, 1, 03), new Date(1990 - 1900, 1, 03), CardType.Debit);
                Gold gold = new Gold("123", new Date(1990 - 1900, 1, 07), 100, "534", "41241",
                                new Date(1990 - 1900, 1, 03), new Date(1990 - 1900, 1, 03), CardType.Gold);
                Platinum platinum = new Platinum("123", new Date(1990 - 1900, 1, 07), 100, "534", "41241",
                                new Date(1990 - 1900, 1, 03), new Date(1990 - 1900, 1, 03), CardType.Platinum);
                client1.getCards().add(debit1);
                client1.getCards().add(gold);
                client1.getCards().add(platinum);
                client2.getCards().add(debit2);

                // AcountExecutives
                Profile profile7 = new Profile("AccountE1", "AccountELastname1", new Date(1971 - 1900, 4, 19),
                                "Morelia", "Michoacan", "1234", "1234", "Verde #90", Branch.Madero);
                Profile profile8 = new Profile("AccountE2", "AccountELastname2", new Date(1971 - 1900, 4, 19),
                                "Morelia", "Michoacan", "4321", "4321", "Verde #91", Branch.Acueducto);
                EmployeeProfile employeeProfile7 = new EmployeeProfile(10000, new Date(1990 - 1900, 1, 03));
                EmployeeProfile employeeProfile8 = new EmployeeProfile(9999, new Date(1990 - 1900, 1, 03));

                AccountExecutive accountExecutive1 = new AccountExecutive(profile7, "AE1", "AE1", employeeProfile7);
                AccountExecutive accountExecutive2 = new AccountExecutive(profile8, "AE2", "AE2", employeeProfile8);

                UserRepository.getUsers().add(accountExecutive2);
                UserRepository.getUsers().add(accountExecutive1);

                // printing
                ManagerRepository.printManagers();
                CapturistRepository.printCapturists();
                ClientRepository.printClients();
                AccountExecutiveRepository.printAccountExecutives(Branch.Acueducto);
                AccountExecutiveRepository.printAccountExecutives(Branch.Madero);
                TransactionRepository.printMaderoTransactions();
        }
}
