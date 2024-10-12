import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exp = sc.nextInt();
        MathCalculable mc1 = new MathFunc(num, exp);
        mc1.exponentiation();
        mc1.module();
        MathCalculable.number();
        double pi = MathCalculable.PIP;
        System.out.println(pi);
    }
}