import java.util.Scanner;
public class p05
{
    public static void main(String args[]) 
{
        Scanner a = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = a.nextLine();

        System.out.print("Enter age: ");
        int age = a.nextInt();

        System.out.print("Enter marks: ");
        float marks = a.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        a.close();
    }
}