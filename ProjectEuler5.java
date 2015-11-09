// solution to Project Euler Problem 5

public class ProjectEuler5 {

    public static void main(String[] args) {

        int n = 20;
        int lcm = n;

        for(; lcm > 0; lcm += n){

            int i = 2;

            // two ways to exit this loop: either value of lcm is incorrect or lcm is correct lcm
            for(; i <= n; i++) {
                if(lcm % i != 0) {

                    // value of lcm is incorrect
                    break;
                }
            }

            // executes only if lcm is correct
            if(i == n + 1) {
                System.out.println(lcm);
                break;
            }
        }
    }
}
