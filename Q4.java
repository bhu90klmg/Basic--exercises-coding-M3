import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int w=scn.nextInt();
        int h=scn.nextInt();
        int a[][]=new int[h][w];
        for (int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                a[i][j]=(i+1)*(j+1);
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
