package Utilities;

import java.util.UUID;

import Enums.Branch;

public class Generator {

    public static String generateCcv() {
        UUID uuid = UUID.randomUUID();
        long lo = uuid.getLeastSignificantBits();
        long hi = uuid.getMostSignificantBits();
        lo = (lo >> (64 - 31)) ^ lo;
        hi = (hi >> (64 - 31)) ^ hi;
        String s = String.format("%03d", Math.abs(hi) + Math.abs(lo));
        return s.substring(s.length() - 3);
    }

    public static String generatePan() {
        UUID uuid = UUID.randomUUID();
        long lo = uuid.getLeastSignificantBits();
        long hi = uuid.getMostSignificantBits();
        lo = (lo >> (64 - 31)) ^ lo;
        hi = (hi >> (64 - 31)) ^ hi;
        String s = String.format("%016d", Math.abs(hi) + Math.abs(lo));
        return s.substring(s.length() - 16);
    }

    public static String clabeGenerator(Branch branch, String pan) {
        String clabe = "";
        if (branch == Branch.Acueducto) {
            return clabe = "111" + "112" + pan + "1";
        } else if (branch == Branch.Madero) {
            return clabe = "111" + "113" + pan + "1";
        } else {
            return clabe;
        }
    }

}
