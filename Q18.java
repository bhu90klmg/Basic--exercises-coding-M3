import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        for (int i=0;i<n;i++){
            String str=scn.nextLine();
            String a[]=str.split(" ");
            int len=a.length;
            int b[]=new int [len];
            for (int j=0;j<len;j++){
                switch (a[j].charAt(0)){
                    case 'C':
                        b[j]=0;
                        break;
                    case 'D':
                        b[j]=13;
                        break;
                    case 'H':
                        b[j]=26;
                        break;
                    case 'S':
                        b[j]=39;
                        break;
                }
                b[j]=b[j]+Integer.parseInt(a[j].substring(1));
            }
            for (int j=0;j<len;j++){
                for (int k=j+1;k<len;k++){
                    if (b[k]>b[j]){
                        int tmp=b[k];
                        b[k]=b[j];
                        b[j]=tmp;
                        String v1=a[k];
                        a[k]=a[j];
                        a[j]=v1;
                    }
                }
            }
            for (int j=0;j<len;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
}
