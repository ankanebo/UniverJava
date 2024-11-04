import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTask {
    void surnameDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите фамилию разработчика");
        String surname = sc.next();
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println("введите год постановки задачи");
        int year = sc.nextInt();
        cal.set(Calendar.YEAR, year);
        System.out.println("месяц");
        int month = sc.nextInt();
        switch(month){
            case 1:
                cal.set(Calendar.MONTH, Calendar.JANUARY);
                break;
            case 2:
                cal.set(Calendar.MONTH, Calendar.FEBRUARY);
                break;
            case 3:
                cal.set(Calendar.MONTH, Calendar.MARCH);
                break;
            case 4:
                cal.set(Calendar.MONTH, Calendar.APRIL);
                break;
            case 5:
                cal.set(Calendar.MONTH, Calendar.MAY);
                break;
            case 6:
                cal.set(Calendar.MONTH, Calendar.JUNE);
                break;
            case 7:
                cal.set(Calendar.MONTH, Calendar.JULY);
                break;
            case 8:
                cal.set(Calendar.MONTH, Calendar.AUGUST);
                break;
            case 9:
                cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
                break;
            case 10:
                cal.set(Calendar.MONTH, Calendar.OCTOBER);
                break;
            case 11:
                cal.set(Calendar.MONTH, Calendar.NOVEMBER);
                break;
            case 12:
                cal.set(Calendar.MONTH, Calendar.DECEMBER);
                break;
            default:
                System.out.println("введите число от 1 до 12");
        }
        System.out.println("введите день постановки задачи");
        int day = sc.nextInt();
        cal.set(Calendar.DAY_OF_MONTH, day);
        System.out.println("часы");
        int hrs = sc.nextInt();
        cal.set(Calendar.HOUR_OF_DAY,hrs);
        System.out.println("минуты");
        int min = sc.nextInt();
        cal.set(Calendar.MINUTE,min);
        System.out.println("секунды");
        System.out.println(" Дата постановки задачи " +
                sdf.format(cal.getTime()));
        System.out.println("Фамилия разработчика:" + surname);
        System.out.println("Время сдачи:" + now);
    }

    void compareDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Год");
        int year = sc.nextInt();
        System.out.println("месяц");
        int month = sc.nextInt();
        System.out.println("день");
        int date = sc.nextInt();
        System.out.println("часы");
        int hrs = sc.nextInt();
        System.out.println("минуты");
        int min = sc.nextInt();
        System.out.println("секунды");
        int sec = sc.nextInt();
        Date main = new Date(year, month, date, hrs, min, sec);
        Date now = new Date();
        if (main.compareTo(now) > 0){
            System.out.println(main + " больше " + now);
        }
        else{
            System.out.println(main + " меньше " + now);
        }
    };
    void dateDay(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d,yyyy");
        System.out.println("Год");
        int year = sc.nextInt();
        System.out.println("месяц");
        int month = sc.nextInt();
        System.out.println("день");
        int date = sc.nextInt();
        System.out.println("часы");
        int hrs = sc.nextInt();
        System.out.println("минуты");
        int min = sc.nextInt();
        System.out.println("секунды");
        int sec = sc.nextInt();
        Date day = new Date(year - 1900, month, date, hrs, min, sec);
        System.out.println("Дата: " +  sdf.format(day));
    }
    void calDay(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM d,yyyy");
        Calendar cal = Calendar.getInstance();
        System.out.println("Год");
        int year = sc.nextInt();
        cal.set(Calendar.YEAR, year);
        System.out.println("месяц");
        int month = sc.nextInt();
        switch(month){
            case 1:
                cal.set(Calendar.MONTH, Calendar.JANUARY);
                break;
            case 2:
                cal.set(Calendar.MONTH, Calendar.FEBRUARY);
                break;
            case 3:
                cal.set(Calendar.MONTH, Calendar.MARCH);
                break;
            case 4:
                cal.set(Calendar.MONTH, Calendar.APRIL);
                break;
            case 5:
                cal.set(Calendar.MONTH, Calendar.MAY);
                break;
            case 6:
                cal.set(Calendar.MONTH, Calendar.JUNE);
                break;
            case 7:
                cal.set(Calendar.MONTH, Calendar.JULY);
                break;
            case 8:
                cal.set(Calendar.MONTH, Calendar.AUGUST);
                break;
            case 9:
                cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
                break;
            case 10:
                cal.set(Calendar.MONTH, Calendar.OCTOBER);
                break;
            case 11:
                cal.set(Calendar.MONTH, Calendar.NOVEMBER);
                break;
            case 12:
                cal.set(Calendar.MONTH, Calendar.DECEMBER);
                break;
            default:
                System.out.println("введите число от 1 до 12");
        }
        System.out.println("день");
        int day = sc.nextInt();
        cal.set(Calendar.DAY_OF_MONTH, day);
        System.out.println("часы");
        int hrs = sc.nextInt();
        cal.set(Calendar.HOUR_OF_DAY,hrs);
        System.out.println("минуты");
        int min = sc.nextInt();
        cal.set(Calendar.MINUTE,min);
        System.out.println("секунды");
        int sec = sc.nextInt();
        cal.set(Calendar.SECOND,sec);
        System.out.println("Дата: " +
                sdf.format(cal.getTime()));
    }
}

