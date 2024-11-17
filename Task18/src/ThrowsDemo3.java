import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo3 {
    public String getDetails(String key) {
        if (Objects.equals(key, "")){
            throw new NullPointerException("key set empty");
        }
        return "data for " + key;
    }
    public void printDetails(String key){
        System.out.println(getDetails(key));
    }
    public void getKey() {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        while (Objects.equals(key, "")) {
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("ключ пустой, введите новый ключ отличный от пустой строки");
                key = sc.nextLine();
            }
        }
        printDetails(key);
    }
}
