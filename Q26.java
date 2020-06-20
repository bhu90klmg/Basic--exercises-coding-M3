import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(fun(a,n));
        System.out.println(f(a,n));
    }
    public static int fun(int x,int y){
        if (y==1){
            return x;
        }else{
            return x*fun(x,y-1);
        }
    }
    public static int f(int x,int y){
        if (y==1){
            return x;
        }else{
            if (y%2==0){
                return f(x,y/2)*f(x,y/2);
            }else{
                return x*f(x,y-1);
            }
        }
    }
}
