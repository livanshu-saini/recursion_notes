public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
    }
    static int reverse(int n){

        // sometimes you might need some additional varialbles in the argument
        //in that case make another function

        int digits = (int)(Math.log10(n)) + 1; 
        return helper(n , digits);
    }
    public static int helper(int n, int digits){
        if(n == 0){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10 , digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean palindrome(int n){
        return n == reverse(n);
    }
}
