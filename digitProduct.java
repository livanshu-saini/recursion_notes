public class digitProduct {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(product(n));
    }
    static int product(int n){
        if(n == 1){
            return 1;
        }

        return (n % 10) * product(n / 10);
    }
}
