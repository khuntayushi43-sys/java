import java.util.Scanner;
public class p07
{
    public static void main(String args[])
{
        Scanner a= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = a.nextInt();

 if(num > 0) {
            System.out.println("Positive Number");
        }
 else(num > 0) {
            System.out.println("Negative Number");
        }

        a.close();
    }
}