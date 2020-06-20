import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str="ABCDEFGHJKLMNPQRSTUVXYWZIO";
        String a[]=str.split("");
        int b[]=new int[26];
        int tmp=10;
        for (int i=0;i<26;i++){
            b[i]=tmp;
            tmp++;
        }
        String st=scn.nextLine();
        String c[]=st.split("");
        for (int i=0;i<a.length;i++){
            if (c[0].charAt(0)==a[i].charAt(0)){
                tmp=b[i];
            }
        }
        int ans=tmp/10+(9*(tmp%10));
        tmp=8;
        for (int i=1;i<=7;i++){
            ans=ans+(tmp*Integer.parseInt(c[i]));
            tmp--;
        }
        ans=ans+Integer.parseInt(c[8])+Integer.parseInt(c[9]);
        if (ans%10==0){
            System.out.println("CORRECT!!!");
        }else{
            System.out.println("WRONG!!!");
        }
    }
}
