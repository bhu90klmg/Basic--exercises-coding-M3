import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        for (int i=0;i<n;i++){
            int tmp=a[i];
            for (int j=i+1;j<n;j++){
                tmp=tmp+a[j];
                if (tmp==0){
                    for (int k=i;k<=j;k++){
                        System.out.print(a[k]+" ");
                    }
                }
            }
        }
        System.out.println();
    }
}
