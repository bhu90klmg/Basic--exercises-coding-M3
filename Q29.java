import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(f(n));
    }
    public static int f(int x){
        if (x==0){
            return 0;
        }
        else if (x==1){
            return 1;
        }else{
            return f(x-1)+f(x-2);
        }
    }
}
