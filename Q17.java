import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int x){
        if (x==1){
            return x+1;
        }else{
            return fun(x-1)+(int)(Math.floor(fun(x/2)));
        }
    }
}
