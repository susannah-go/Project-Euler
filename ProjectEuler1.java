// solution to Project Euler Problem 1

public class ProjectEuler1 {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i < 1000; i ++) {

            if(i % 3 == 0) {
                sum += i;
                continue;
            } else if(i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}
