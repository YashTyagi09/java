import java.util.*;
public class invrted_triangle_rec {
    public static void strap(int n) {
        if (n == 0)
            return;
        System.out.print("*");
        strap(n - 1);

    }

    public static void pattern(int col, int row) {
        if (row == 0) {
            return;
        }
        strap(col);
        System.out.println();
        pattern(col, row - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        pattern(n, m);
        sc.close();
    }

}

    

