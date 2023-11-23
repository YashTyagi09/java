import java.util.*;
public class fact_fun {
    public static void fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        System.out.print(f);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        fact(n);
        sc.close();
    }
    
}
