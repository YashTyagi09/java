import java.util.Scanner;
public class type_of_triangle {
    public static void triangle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the three sides of a triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c){
            System.out.print("Triangle is equilateral triangle...");
        }
        else if(a!=b&&b!=c&&a!=c){
             System.out.print("Triangle is scalen...");
        }
        else{
             System.out.print("Triangle is isosceles");
        }
        sc.close();

    }
    public static void main(String[] args){
        triangle();

    }
    
}
