// solution to Project Euler Problem 6

public class ProjectEuler6 {

    public static void main(String[] args) {

        int n = 100;
        int ans = (int) (3 * Math.pow(n, 4) + 2 * Math.pow(n, 3) - 3 * Math.pow(n, 2) - 2 * n) / 12;

        System.out.println(ans);

    }

}
