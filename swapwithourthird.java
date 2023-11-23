import java.util.Scanner;
public class swapwithourthird {
    public static void swap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers that you want to swap:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping the numbers are:"+"a="+a+","+"b="+b);
        sc.close();
    }
    public static void main(String[] args ){
        swap();

    }

    
}
