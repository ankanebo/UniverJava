import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CheckInfo{
    public boolean regCheck(String Inn){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(Inn);
        return matcher.matches();
    }
    public String checkInn(String Inn) throws Exception {
        boolean flag = regCheck(Inn);
        if (Inn.length() != 12 || !flag){
            throw new Exception("Инн введен не правильно");
        }
        return "Ваш инн " + Inn + " принят";
    }
    public void printCheckInn(String Inn) throws Exception {
        System.out.println(checkInn(Inn));
    }
    public void getInn() throws Exception {
        Scanner sc = new Scanner(System.in);
        String Inn = sc.nextLine();
        boolean flag = regCheck(Inn);
        while (Inn.length() != 12 || !flag){
            try {
                printCheckInn(Inn);
            } catch (Exception e){
                System.out.println("Введите Инн из 12 цифр от 0 до 9");
                Inn = sc.nextLine();
            }
        }
        printCheckInn(Inn);
    }
}
