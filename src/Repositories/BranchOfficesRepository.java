package Repositories;

import java.util.ArrayList;

import Entities.Employee;
import Entities.Transaction;

public class BranchOfficesRepository {

    private static ArrayList<Employee> maderoEmployees = new ArrayList<>();
    private static ArrayList<Employee> acueductoEmployees = new ArrayList<>();
    private static ArrayList<Transaction> maderoInvestements = new ArrayList<>();
    private static ArrayList<Transaction> acueductoInvestemens = new ArrayList<>();

    public static ArrayList<Employee> getMaderoEmployees() {
        return maderoEmployees;
    }

    public static void setMaderoEmployees(ArrayList<Employee> maderoEmployees) {
        BranchOfficesRepository.maderoEmployees = maderoEmployees;
    }

    public static ArrayList<Employee> getAcueductoEmployees() {
        return acueductoEmployees;
    }

    public static void setAcueductoEmployees(ArrayList<Employee> acueductoEmployees) {
        BranchOfficesRepository.acueductoEmployees = acueductoEmployees;
    }

    public static ArrayList<Transaction> getMaderoInvestements() {
        return maderoInvestements;
    }

    public static void setMaderoInvestements(ArrayList<Transaction> maderoInvestements) {
        BranchOfficesRepository.maderoInvestements = maderoInvestements;
    }

    public static ArrayList<Transaction> getAcueductoInvestemens() {
        return acueductoInvestemens;
    }

    public static void setAcueductoInvestemens(ArrayList<Transaction> acueductoInvestemens) {
        BranchOfficesRepository.acueductoInvestemens = acueductoInvestemens;
    }

}
