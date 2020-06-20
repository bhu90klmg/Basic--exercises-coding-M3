import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int a[][]=new int [n][n];
        int b[][]=new int [n][n];
        int tmp=1;
        for (int i=0;i<n;i++){
            if (i%2==0){
                for (int j=0;j<n;j++){
                    a[i][j]=tmp;
                    tmp++;
                }
            }else{
                for (int j=n-1;j>=0;j--){
                    a[i][j]=tmp;
                    tmp++;
                }
            }
        }
        tmp=1;
        for (int i=0;i<n;i++){
            if (i%2==0){
                for (int j=0;j<n;j++){
                    b[j][i]=tmp;
                    tmp++;
                }
            }else{
                for (int j=n-1;j>=0;j--){
                    b[j][i]=tmp;
                    tmp++;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
