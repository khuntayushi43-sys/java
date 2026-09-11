class p23 {
    public static void main(String args[]) {
        try {
            int a = 20;
            int b = 0;

            int c = a / b;

            System.out.println("Answer = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide a number by zero");
        }

        System.out.println("Program completed successfully");
    }
}