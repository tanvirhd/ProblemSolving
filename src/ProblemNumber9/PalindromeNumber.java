package ProblemNumber9;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12121));
    }
    public static boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0) return false;
        boolean res = true;
        String number = String.valueOf(x);
        int loopSize = number.length()/2; // 3

        for(int i = 0, j = (number.length()-1); i < loopSize; i++,j-- ){
            if(number.charAt(i) != number.charAt(j)){
                res = false;
                break;
            }
        }
        return res;
    }
}
