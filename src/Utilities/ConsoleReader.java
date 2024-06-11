package Utilities;

import java.util.Scanner;

public class ConsoleReader {

    private static Scanner input = new Scanner(System.in);

    public static int inputInteger(String prompt) {
        System.out.print(prompt + ": ");
        int integer = input.nextInt();
        return integer;
    }

    public static String inputString(String prompt) {
        System.out.print(prompt + ": ");
        String string = input.nextLine();
        return string;
    }

    public static Double inputDouble(String prompt) {
        System.out.print(prompt + ": ");
        double value = input.nextDouble();

        return value;
    }

    public static boolean inputBoolean(String prompt) {
        System.out.print(prompt + ": ");
        boolean decision = input.nextBoolean();
        return decision;
    }

    public static void bufferCleaner() {
        input.nextLine();
    }

}
