import java.util.Scanner;
public class p09
{
    public static void main(String args[]) 
{
        Scanner a = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = a.nextInt();

        if(marks >= 90) {
            System.out.println("Grade A");
        }
        else if(marks >= 75) {
            System.out.println("Grade B");
        }
        else if(marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

      a.close();
}
}