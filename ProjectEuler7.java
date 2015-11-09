// solution to Project Euler Problem 7

public class ProjectEuler7 {

    public static void main(String[] args) {

        int n = 10001;
        int i = 2;
        int primeCount = 0;

        while(true) {

            if(isPrime(i)) {
                primeCount++;
            }

            if(primeCount == n) {
                System.out.println(i);
                break;
            }
            else {
                i++;
            }
        }

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
