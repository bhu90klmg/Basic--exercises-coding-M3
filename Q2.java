import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random ran=new Random();
        int n=scn.nextInt();
        ran.setSeed(n);
        int a[]=new int[6];
        int i=0;
        while (i<6){
            boolean flag=true;
            a[i]=ran.nextInt(42)+1;
            for (int j=0;j<i;j++){
                if (a[i]==a[j]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.print(a[i]+"\t");
                i++;
            }
        }
        System.out.println();
    }
}
