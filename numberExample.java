public class numberExample{
    public static void main(String[] args){
        // print first five numbers : 1 2 3 4 5
        print(1);
    }
    static void print(int n){

        if(n == 5){
            System.out.print(n);
            return;
        }

        System.out.println(n);
        print(++n);
        // ++n will work but n++ will not work
    }
}