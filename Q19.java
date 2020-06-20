import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        String a[]=str.split("");
        boolean flag=true;
        for (int i=0;i<a.length;i++){
            if (a[i].charAt(0)!=a[a.length-1-i].charAt(0)){
                flag=false;
            }
        }
        if (flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
