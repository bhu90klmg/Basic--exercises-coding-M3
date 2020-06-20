import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=scn.nextInt();
            b[i]=fun(a[i]);
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (b[i]>b[j]){
                    int tmp=b[i];
                    b[i]=b[j];
                    b[j]=tmp;
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }else if (b[i]==b[j]){
                    if (a[i]>a[j]){
                        int tmp=a[i];
                        a[i]=a[j];
                        a[j]=tmp;
                        tmp=b[i];
                        b[i]=b[j];
                        b[j]=tmp;
                    }
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println();
    }
    public static int fun(int x){
        int tmp=0;
        while (x!=0){
        tmp=tmp+x%10;
        x=x/10;
    }
        return tmp;
    }
}
