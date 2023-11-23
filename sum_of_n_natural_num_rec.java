import java.util.*;
public class sum_of_n_natural_num_rec {
    public static int sum(int n,int s){

        if(n==0)
        return 0;
        s=s+n;
        sum(n-1,s);
        return n +sum(n-1,s);
    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        int res=sum(a, s);
        System.out.println(res);
        sc.close();
    }
    
}
