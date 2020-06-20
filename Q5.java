import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(fun(m)/(fun(n)*fun(m-n)));
    }
    public static long fun(int x){
        int sum=1;
        for (int i=1;i<=x;i++){
            sum=sum*i;
        }
        return sum;
    }
}
