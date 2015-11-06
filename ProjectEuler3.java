// solution to Project Euler Problem 3

import java.math.BigInteger;

public class ProjectEuler3 {

    public static void main(String[] args) {

        BigInteger n = new BigInteger("600851475143");
        BigInteger ans = new BigInteger("-1");
        BigInteger r;
        BigInteger q;

        for(BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {

            r = n.remainder(i);
            q = n.divide(i);

            if(r.equals(BigInteger.ZERO) && isPrime(q)) {
                ans = q;
                break;
            }
        }

        System.out.print(ans);
    }

    public static boolean isPrime(BigInteger n) {

        if(n.compareTo(new BigInteger("2")) < 0) {
            return false;
        }

        boolean retValue = true;
        BigInteger upper = getSqrt(n);

        for(BigInteger i = new BigInteger("2"); i.compareTo(upper) < 0; i = i.add(BigInteger.ONE)) {
            if(n.remainder(i).equals(BigInteger.ZERO)) {
                retValue = false;
                break;
            }
        }

        return retValue;

    }

    public static BigInteger getSqrt(BigInteger n) {

        BigInteger i = BigInteger.ONE;

        for(; i.pow(2).compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {

        }

        return i.subtract(BigInteger.ONE);
    }

}
