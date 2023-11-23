import java.util.*;
public class powerof2_rec {
    static void pow2(int value){
        if(value==1)
        System.out.println("yes");
        else if(value<0 ||value%2!=0){
            System.out.println("not");
        }
        else{
            pow2(value/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        pow2(num);
        sc.close(); 
    }
    
}
