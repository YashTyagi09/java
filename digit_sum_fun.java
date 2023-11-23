import java.util.*;
public class digit_sum_fun {
    public static void digitsum(int a){
        int sum=0;
        while(a>0){
            int c=a%10;
            sum+=c;
            a=a/10;
        }
        System.out.print("sum of digits of entered number is :"+sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        digitsum(n);
        sc.close();
    }
    
}
