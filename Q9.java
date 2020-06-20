import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        String a[]=str.split(" ");
        int b[]=new int [a.length];
        for (int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        for (int i=0;i<b.length;i++){
            for (int j=i+1;j<b.length;j++){
                if (b[i]>b[j]){
                    int tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                }
            }
        }
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}
