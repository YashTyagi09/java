import java.util.*;
public class rev_fun {
    public static void rev(int a){
        int r=0;
        while(a>0){
            int b=a%10;
            r=(r*10)+b;
            a=a/10;
        }
        System.out.print("number is:"+r);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number to be reversed:");
        int n=sc.nextInt();
        rev(n);
        sc.close();

    }
    
}
