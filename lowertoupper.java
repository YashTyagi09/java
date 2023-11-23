import java.util.*;
public class lowertoupper {
    public static void upperlower(String k)
    {
        for(int i=0;i<k.length();i++)
        {
            System.out.print((char)(k.charAt(i)-32));
        }
    }
    public static void main(String args[])
    {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter any string");
        String a=m.nextLine();
        upperlower(a);
        m.close();
}
}