package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder sd = new StringBuilder();
        for( int i = 1; i< numberOfRows; i++ ){
            for(int j = 0; j<i; j++){
                sd.append("*");
            }
            sd.append("\n");
        }
        return sd.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder sd = new StringBuilder();
        for( int i = 0; i< numberOfStars; i++ ){
            sd.append("*");

        }

        return sd.toString();
    }

    public static String getSmallTriangle() {




        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
