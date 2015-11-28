// solution to Project Euler Problem 10

import java.math.BigInteger;

public class ProjectEuler10 {

    public static void main(String[] args) {

        BigInteger sum = BigInteger.ZERO;
        int k = 2000000;

        for(int i = 1; i < k; i++) {
            if(isPrime(i)) {

                sum = sum.add(new BigInteger(Integer.toString(i)));
            }
        }

        System.out.println(sum);
    }

    public static boolean isPrime(int n) {

        if(n < 2) {
            return false;
        }

        boolean retValue = true;
        int upper = (int) Math.floor(Math.sqrt(n));

        for(int i = 2; i <= upper; i++) {
            if(n % i == 0) {
                retValue = false;
                break;
            }
        }

        return retValue;

    }

}
