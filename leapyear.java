
    import java.util.Scanner;

public class leapyear {
    public static void leap(){
        Scanner m=new Scanner(System.in);
        System.out.println("Enter any year");
        int year=m.nextInt();
        if(year%4==0&&year%100!=0||year%400==0)
        {
            System.out.print("entered year is a leapyear");
        }
        else{
            System.out.print("entered year is not a leapyear");
          }
          m.close();
    }
    public static void main(String args[])
    {
        
}
}
    

