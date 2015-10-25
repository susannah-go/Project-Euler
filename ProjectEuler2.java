// solution to Project Euler Problem 2

public class ProjectEuler2 {

    public static void main(String[] args) {

        int sum = 0;
        int n = 1;

        int value1 = 1;
        int value2 = 2;
        int fib;

        while(true) {

            // get nth Fibonacci number
            if(n <= 2) {
                fib = n;
            } else {
                fib = value1 + value2;
                value1 = value2;
                value2 = fib;
            }

            if(fib > 4000000) {
                break;
            }

            if(fib % 2 == 0) {
                sum += fib;
            }

            n++;
        }

        System.out.println(sum);

    }
}

