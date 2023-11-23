import java.util.*;
public class Even_rec {

    
    // public class Evenodd1 {
     static void even(int m){
            if(m==0){
    
                return;
            }
            even(m-1);
              if(m%2==0){
    
                  System.out.println(m);
                }
    
    
        }
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            even(a);
            sc.close();
        }
        
    }
    
    

