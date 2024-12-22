import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size of map: ");
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int res = 0;
        System.out.println("Enter map: ");
        for (int q = 0; q < N; q++){
            String[] str = sc.nextLine().split(" ");
            for ( int i = 0; i < N; i++){
                res += Integer.parseInt(str[i]);
            }
        }
        System.out.println(res/2);
    }
}