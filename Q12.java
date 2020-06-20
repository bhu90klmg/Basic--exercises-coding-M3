import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int a[]=new int [n1];
        int b[]=new int [n2];
        int c[]=new int [n1];
        for (int i=0;i<n1;i++){
            a[i]=scn.nextInt();
        }
        for (int i=0;i<n2;i++){
            b[i]=scn.nextInt();
        }
        int ans=0;
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                if (a[i]==b[j]){
                  boolean flag=true;
                  for (int k=0;k<ans;k++){
                      if (a[i]==c[k]){
                          flag=false;
                          break;
                      }
                  }
                  if (flag){
                      c[ans]=a[i];
                      ans++;
                  }
                }
            }
        }
        System.out.println(ans);
    }
}
