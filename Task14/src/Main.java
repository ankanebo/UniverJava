import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nПоиск валюты\n");
        String str = "25.99 USD, 25.98 RUB, 25.97 EU, 900.53 tr, 900 RUB, 45 USD, 67 EU";
        Perform.findVal(str);

        System.out.println("\nПроверка почты\n");

        Perform.checkEmail("user@example.com");
        Perform.checkEmail("myhost@com.ru");
        Perform.checkEmail("myhost@co2m.ru");
        Perform.checkEmail("@my.ru");
        Perform.checkEmail("Julia String");
        Perform.checkEmail("myhodjjkg45g_oiwst@com");

        System.out.println("\nПроверка дат\n");

        Perform.checkDate("vksbvkjbf");
        Perform.checkDate("20/04/23");
        Perform.checkDate("20/04/2023");
        Perform.checkDate("35/04/2023");
        Perform.checkDate("20/04/1900");
        Perform.checkDate("20/04/9999");
    }
}