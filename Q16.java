import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        String a[]=str.split("");
        int b[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        for (int i=0;i<4;i++){
            if (b[i]==1){
                System.out.print("    * ");
            }else if (b[i]==4){
                System.out.print("*   * ");
            }else{
                System.out.print("***** ");
            }
        }
        System.out.println();
        for (int i=0;i<4;i++){
            if (b[i]==1||b[i]==2||b[i]==3||b[i]==7){
                System.out.print("    * ");
            }else if (b[i]==5||b[i]==6){
                System.out.print("*     ");
            }else{
                System.out.print("*   * ");
            }
        }
        System.out.println();
        for (int i=0;i<4;i++){
            if (b[i]==1||b[i]==7){
                System.out.print("    * ");
            }else if (b[i]==0){
                System.out.print("*   * ");
            }else{
                System.out.print("***** ");
            }
        }
        System.out.println();
        for (int i=0;i<4;i++){
            if (b[i]==0||b[i]==8){
                System.out.print("*   * ");
            }else if (b[i]==2){
                System.out.print("*     ");
            }else{
                System.out.print("    * ");
            }
        }
        System.out.println();
        for (int i=0;i<4;i++){
            if (b[i]==1||b[i]==4||b[i]==7||b[i]==9){
                System.out.print("    * ");
            }else{
                System.out.print("***** ");
            }
        }
        System.out.println();
    }
}
