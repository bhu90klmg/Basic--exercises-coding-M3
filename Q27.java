import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int x){
        if (x<10){
            return 1;
        }else{
            return 1+fun(x/10);
        }
    }
}
