import java.util.Scanner;
public class simpleinterest{
    public static void simple(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of S,R,T");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float i=(a*b*c)/100;    
        System.out.println("calculted simple interest is:"+i);
        sc.close();
    }
    public static void main(String[] args){
        simple();
    }

}