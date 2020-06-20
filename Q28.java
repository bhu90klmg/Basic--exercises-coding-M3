import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(f(m,n));
    }
    public static int f(int x,int y){
        int a=Math.max(x,y);
        int b=Math.min(x,y);
        if (a%b==0){
            return b;
        }else{
            return f(a%b,b);
        }
    }
}
