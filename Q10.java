import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        int ans=a[0];
        for (int i=0;i<n;i++){
            int tmp=a[i];
            for (int j=i+1;j<n;j++){
                tmp=tmp*a[j];
                if (tmp>ans){
                    ans=tmp;
                }
            }
        }
        System.out.println(ans);
    }
}
