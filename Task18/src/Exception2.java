import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            //System.out.println(i);
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите число в надлежащем формате");
        }
    }
        public void exceptionDemo2() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                //System.out.println(i);
                try {
                    System.out.println(2 / i);
                } catch (Exception e) {
                    System.out.println("Attempted division by zero");
                }
            } catch (Exception e) {
                System.out.println("Введите число в надлежащем формате");
            }
            finally {
                System.out.println("блок finally");
            }
        }
    }
