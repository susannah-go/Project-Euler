// solution to Project Euler Problem 125
import java.util.*;

public class ProjectEuler125 {

    public static void main(String[] args) {

        int max = (int)Math.pow(10, 8);

        HashSet<Integer> hs = new HashSet<Integer>();
        long answer = 0;
        int cap = (int)(Math.floor(Math.sqrt(max)));

        for(int start = 1; start < cap; start++) {
            int count = 0;
            int sum = 0;
            int j = start;

            while(sum < max) {
                sum += Math.pow(j, 2);
                count++;

                if(sum >= max) {
                    break;
                }

                if(count > 1 && !hs.contains(sum) && isPalindrome(sum)) {
                    answer += sum;
                    hs.add(sum);
                }

                j++;
            }
        }

        System.out.println(answer);
    }

    public static boolean isPalindrome(int n) {
        String s = ((Integer)n).toString();
        int l = s.length();
        boolean retValue = true;

        for(int i = 0; i <= l/2; i++) {
            if(s.charAt(i) != s.charAt(l - i - 1)) {
                retValue = false;
                break;
            }
        }

        return retValue;
    }
}
