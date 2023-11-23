import java.util.Scanner;

public class sum_of_n_numbers {
    public static void num(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the range of natural numbers:");
        int n=sc.nextInt();
        int sum=0;
        sum=n*(n+1)/2;
        System.out.print("sum is:"+sum);
        sc.close();
}
public static void main(String[] args){
    num();
}
    
}
