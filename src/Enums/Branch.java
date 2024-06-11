package Enums;

import Utilities.ConsoleReader;

public enum Branch {
    Madero,
    Acueducto;

    public static Branch getBrach() {
        int integer = ConsoleReader.inputInteger("1 - Madero\n2 - Acueducto");
        if (integer == 1) {
            return Branch.Madero;
        } else if (integer == 2) {
            return Branch.Acueducto;
        } else {
            return null;
        }
    }

}
