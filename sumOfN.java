public class sumOfN {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }
}
