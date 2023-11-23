import java.util.*;

public class evenodd_rec {
    static void oddeven(int n){
        if(n==0){
            return;

        }
        oddeven(n-1);
        if(n%2==0){
            System.out.println("even:"+n);
        }
        else{
            System.out.println("odd:"+n);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oddeven(n);
        sc.close();

    }
    
}
