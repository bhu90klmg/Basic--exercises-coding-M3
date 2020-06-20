import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        String a[]=str.split("");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
