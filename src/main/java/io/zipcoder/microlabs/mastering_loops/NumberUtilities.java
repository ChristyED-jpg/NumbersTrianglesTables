package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    static boolean isOdd(int number){
        return (number % 2) ==0;
    }
    public static String getEvenNumbers(int start, int stop) {
       StringBuilder tr = new StringBuilder();
       for ( int i= start; i < stop; i= i+i){
           if ( !isOdd(i)){
               tr.append(i);
           }
       }

      return tr.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder st = new StringBuilder();
        for ( int i= start; i < stop; i= i+i){
            if ( !isOdd(i)){
                st.append(i);
            }
        }

        return st.toString();
    }



    public static String getSquareNumbers(int start, int stop, int step) {
        return  getExponentiations( start,stop,step,2);
    }

    public static String getRange(int start) {
        return getRange(start, 0, 1);
    }

    public static String getRange(int start, int stop) {

        return getRange ( start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
           StringBuilder vr  = new StringBuilder();
                   for( int i = start; i < stop; i = i + step){
                       vr.append(i);
        }
        return vr.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb  = new StringBuilder();
        for( int i = start; i < stop; i = i + step){
            sb.append(i);
        }
        return sb.toString();
    }


    }

