import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        String a[]=str.split(" ");
        System.out.println(a.length);
        int b[]=new int [123];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length();j++){
                b[(int)a[i].charAt(j)]++;
            }
        }
        for (int i=97;i<123;i++){
            if (b[i]!=0){
                System.out.println((char)i+"="+b[i]);
            }
        }
        for (int i=65;i<91;i++){
            if (b[i]!=0){
                System.out.println((char)i+"="+b[i]);
            }
        }
    }
}
