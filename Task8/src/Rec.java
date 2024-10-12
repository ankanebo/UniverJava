import java.util.Scanner;
public class Rec {
    int n;

    public Rec(int n, int a, int b) {
        this.n = n;

    }

    public static int recursion1(int a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Math.max(a, n);
        if (n == 0) {
            System.out.println(max);
            return 0;
        } else {
            return recursion1(max);
        }
    }

    public static int recursion2(int a, int k) {
        for (int i = 0; i < a; i++) {
            if (k > 0) {
                k -= 1;
                System.out.print(a);
            } else {
                return 0;
            }

        }
        return recursion2(a + 1, k);
    }

    public static int recursion3(int a, int h){
        if (h > 0){
            h -= 1;
            System.out.print(a);
        }
        else{
            return 0;
        }
        return recursion3(a + 1, h);
    }

}

