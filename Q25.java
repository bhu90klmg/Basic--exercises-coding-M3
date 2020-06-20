import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        for (int i=0;i<a.length;i++){
            String str=scn.next();
            if (str.equals("X")){
                a[i]=10;
            }else{
                a[i]=Integer.parseInt(str);
            }
        }
        b[0]=a[0];
        c[0]=a[0];
        for (int i=1;i<10;i++){
            b[i]=b[i-1]+a[i];
            c[i]=c[i-1]+b[i];
        }
        if (c[9]%11==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
