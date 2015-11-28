// solution to Project Euler Problem 9

public class ProjectEuler9 {

    public static void main(String[] args) {

        for(int a = 1; a < 999; a++) {
            for(int b = 1; b < 999 ; b++) {
                for(int c = 1; c < 999; c++) {

                    if(a + b + c != 1000 || Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2)) {
                        continue;
                    }

                    System.out.println(a * b * c);
                    return;

                }
            }
        }

    }

}
