// solution to Project Euler Problem 12

import java.math.BigInteger;

public class ProjectEuler12 {

    public static void main(String[] args) {

        int k = 500;  // lower bound on number of divisors
        int i = 1;

        while(true){

            BigInteger t = getTriNum(i);

            int d = countDivisors(t);

            if(d >= k) {
                System.out.println(t);
                break;
            }

            i++;
        }
    }

    public static BigInteger getTriNum(int n) {

        BigInteger retValue = BigInteger.ONE;
        BigInteger bigN = new BigInteger(Integer.toString(n));

        retValue = retValue.multiply(bigN);
        retValue = retValue.multiply(bigN.add(BigInteger.ONE));
        retValue = retValue.divide(new BigInteger("2"));

        return retValue;
    }


    public static int countDivisors(BigInteger n) {

        int numDivisors = 0;
        BigInteger bigI;

        for(bigI = BigInteger.ONE; (bigI.pow(2)).compareTo(n) <= 0; bigI = bigI.add(BigInteger.ONE)) {

            if(n.remainder(bigI).equals(BigInteger.ZERO)) {
                numDivisors += 2;
            }

        }

        return numDivisors;
    }
}
