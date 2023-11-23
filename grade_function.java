import java.util.*;
public class grade_function {
    public static void grade(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your marks:");
        int g=sc.nextInt();
        if(g>=90){
            System.out.print("congratulations you got A grade..");
        }
        else if(g>=70&&g<90){
            System.out.print("good you got B garde..");
        }
        else if(g>=50&&g<70){
            System.out.print("you got grade C hope you do better in next exam..");
        }
        else{
            System.out.print("you should study more to get good grade your garde is D..");
        }
        sc.close();

        
    }
    public static void main(String[] args){
        grade();

    }
    
}
