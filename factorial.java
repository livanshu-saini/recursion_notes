public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        //base condition
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
