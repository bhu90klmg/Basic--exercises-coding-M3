import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        String a[]=str.split(" ");
        int b[]=new int [a.length];
        for (int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        for (int i=0;i<b.length;i++){
            int v1=b[i]*b[i];
            System.out.print(v1+"\t");
        }
        System.out.println();
    }
}
