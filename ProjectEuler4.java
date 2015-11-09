// solution to Project Euler Problem 4

public class ProjectEuler4 {

    public static void main(String[] args) {

        Integer ans = 1;

        for(int i = 999; i > 0; i--) {
            for(int j = 999; j > 0; j--) {
                Integer n = i * j;
                if(n > ans && isPalindrome(n.toString())) {
                    ans = n;
                }
            }
        }

        System.out.println(ans);
    }

    public static boolean isPalindrome(String s) {

        if(s.length() < 2) {
            return true;
        } else if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
    }

}
