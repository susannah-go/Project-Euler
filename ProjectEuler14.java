// solution to Project Euler Problem 14

import java.math.BigInteger;

public class ProjectEuler14 {

    static int maxStart;
    static int maxLen;
    static int[] myArray;   // array for possible values of maxStart

    public static void main(String[] args) {

        int cap = 1000000;

        myArray = new int[1000000];
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = 0;
        }

        for(int n = 1; n < cap; n++) {

            if(myArray[n] != 0) {
                continue;
            }

            checkLen(n);
        }

        System.out.println(maxStart);

    }

    public static void checkLen(int n) {

        int len = 1;
        BigInteger bigN = new BigInteger(Integer.toString(n));

        while(bigN.compareTo(BigInteger.ONE) > 0) {

            if(bigN.remainder(new BigInteger("2")).equals(BigInteger.ZERO)) {
                bigN = bigN.divide(new BigInteger("2"));
            }
            else {
                bigN = bigN.multiply(new BigInteger("3"));
                bigN = bigN.add(BigInteger.ONE);
            }

            if(bigN.compareTo(new BigInteger("1000000")) < 0) {
                myArray[bigN.intValue()] = 1;
            }

            len++;
        }

        if(len > maxLen) {
            maxLen = len;
            maxStart = n;
        }
    }

}
