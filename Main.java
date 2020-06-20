import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        String a[]=str.split("");
        for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
