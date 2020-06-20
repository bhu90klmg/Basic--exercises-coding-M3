import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int m1=scn.nextInt();
        int n2=scn.nextInt();
        int m2=scn.nextInt();
        int a[][]=new int[n1][m1];
        int b[][]=new int[n2][m2];
        int c[][]=new int[n1][m2];
        for (int i=0;i<n1;i++){
            for (int j=0;j<m1;j++){
                a[i][j]=scn.nextInt();
            }
        }
        for (int i=0;i<n2;i++){
            for (int j=0;j<m2;j++){
                b[i][j]=scn.nextInt();
            }
        }
        for (int i=0;i<n1;i++){
            for (int j=0;j<m2;j++){
                int tmp=0;
                for (int k=0;k<m1;k++){
                    tmp=tmp+(a[i][k]*b[k][j]);
                }
                c[i][j]=tmp;
            }
        }
        for (int i=0;i<n1;i++){
            for (int j=0;j<m2;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
