import java.util.Scanner;
public class p06
{
    public static void main(String args[]) 
{
        Scanner a = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = a.nextLine();

        for(int i = 1; i <= 10; i++) {
            System.out.println(name);
        }

        a.close();
    }
}