import java.util.Scanner;
public class positive_negative_numbers {
    public static void positivenegative(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to be checked that it is positive or negative:");
        int a=sc.nextInt();
        if(a>0)
        System.out.println("the number is positive.......");
        else{
            System.out.println("ths number is negative.......");
        }
        sc.close();
    }
    public static void main(String[] args){
        positivenegative();
    }
    
    
}

