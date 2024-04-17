import java.util.*;

public class reverseaNumber {

     // way - 1
    //  static int sum = 0;
    //  static void reverse1(int n){
    //     if(n == 0){
    //         return;
    //     }
    //     int rem = n % 10;
    //     sum = sum * 10 + rem;
    //     reverse1(n / 10);
    //  }
    public static void main(String[] args) {
        int n = 1234;
        // reverse1(n);
        // System.out.println(sum);
        System.out.println(reverse2(n));
        

    }


    // way - 2
    static int reverse2(int n){

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

   
}
