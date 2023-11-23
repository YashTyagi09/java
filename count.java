import java.util.*;
public class count {
    public static void co(){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number:");
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            int a=n%10;
            c+=1;
            n=n/10;
        }
        System.out.print("number of digits are:"+c);
        
        sc.close();
    }
      public static void main(String[] args){
               co();
}
}
