import java.util.*;
public class menu_fun {
    public static void menu(int a,int b,int n){
                switch(n){
                case 1:System.out.print("Addition is :"+(a+b));
                       break;
                case 2:System.out.print("Subtraction is :"+(a-b));
                       break;
                case 3:System.out.print("Multiplication is :"+(a*b));
                       break;
                case 4:System.out.print("division is :"+(a/b));
                       break;
                default :System.out.print("wrong choice ");       
            }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter first number:");
        int c=sc.nextInt();
        System.out.print("enter second number:");
        int d=sc.nextInt();
        System.out.print(" \n1.Additon\n2.Subtraction\n3.Multiplication\n4.Division \n");
        System.out.print("enter your choice what you want to do:");
        int e=sc.nextInt();
        menu(c,d,e);
        sc.close();

    }
    
}
