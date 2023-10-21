
    import java.util.*;
public class areaandperimeter {
    public static int area(int l,int b)
    {
        return(l*b);
    }
    public static int perimeter(int l,int b)
    {
        return(2*(l+b));
    }
    public static void main(String args[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("enter length of rectngle : ");
        int n=m.nextInt();
        System.out.print("enter breadth of rectngle : ");
        int k=m.nextInt();
        int area=area(n,k);
        System.out.println("Area of rectngle is : "+area);
        int perimeter=perimeter(n,k);
        System.out.println("Perimeter of rectngle is : "+perimeter);
        m.close();
}
}
    

