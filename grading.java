
    import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks of the student: ");
        marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade = 'A'");
        } else if (marks < 90 & marks >= 80) {
            System.out.println("Grade ='B'");
        } else if (marks < 80 & marks >= 70) {
            System.out.println("Grade ='C'");
        } else if (marks < 70 & marks >= 60) {
            System.out.println("Grade ='D'");
        } else if (marks < 60 & marks >= 50) {
            System.out.println("Grade ='E'");
        } else {
            System.out.println("Grade = 'F'");
        }
        sc.close();
    }
}
    

