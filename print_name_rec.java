import java.util.*;

public class print_name_rec {
    public static void print(String a,int i){
        if(i==0){
            return;
        }
        System.out.println(a);
        print(a,i-1);


    }
    public static void main(String[] args){
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        // System.out.println(a);
        print(a, 10);
        sc.close();
    }
    
}
