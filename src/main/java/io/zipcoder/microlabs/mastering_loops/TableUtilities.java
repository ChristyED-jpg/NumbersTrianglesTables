package io.zipcoder.microlabs.mastering_loops;
import java.util.Scanner;
public class TableUtilities {
    public static String getSmallMultiplicationTable(int num) {

        return getMultiplicationTable(5);


    }


    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }





    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                if ((i * j) <= 9) {
                    sb.append("  " + (i * j) + " |");
                } else if ((i * j) > 9 && (i * j) < 100) {
                    sb.append(" " + (i * j) + " |");
                } else {
                    sb.append((i * j) + " |");

                }
            }
            sb.append("\n");

        }
        return sb.toString();
    }
}













