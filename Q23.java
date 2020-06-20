import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for (int i=2;i<n/2;i++){
            boolean flag=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                int m=n-i;
                for (int j=2;j<m;j++){
                    if (m%j==0){
                        flag=false;
                        break;
                    }
                }
                if (flag){
                    System.out.println(i+"+"+m);
                }
            }
        }
    }
}
