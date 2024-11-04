import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
import java.lang.Override;
public class Student {
    String surname;
    String name;
    String group;
    int age;
    Date bbirthday;
    String format;


    public Student(String surname, String name, String group, int age, Date birthday){
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.age = age;
        this.bbirthday = birthday;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите формат вывода дня рождения студента(длинный, короткий, средний)");
        format = sc.next();
    }
    void output(){
        System.out.printf(" Фамилия: %s,Имя: %s, Группа: %s, Возраст: %d", surname, name, group, age);
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию");
        surname = sc.next();
        System.out.println("Введите имя");
        name = sc.next();
        System.out.println("Введите группу");
        group = sc.next();
        System.out.println("Введите возраст");
        age = sc.nextInt();
    }
    void setSurname(String surname){
        this.surname = surname;
    }
    void setName(String name){
        this.name = name;
    }
    void setGroup(String group){
        this.group = group;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    String getGroup(){
        return group;
    }
    String getSurname(){
        return surname;
    }
    String getName(){
        return name;
    }
    void setFormat(String form){
        this.format = form;
    }
    void birthday() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Год");
        int year = sc.nextInt() - 1900;
        System.out.println("месяц");
        int month = sc.nextInt();
        System.out.println("день");
        int date = sc.nextInt();
        bbirthday = new Date(year, month, date);
        if (Objects.equals(format, "короткий")) {
            SimpleDateFormat dateFormatter = new
                    SimpleDateFormat("EEEE, MMMM d, yyyy");
            System.out.println(dateFormatter.format(bbirthday));
        } else if (Objects.equals(format, "средний")) {
            SimpleDateFormat dateFormatter = new
                    SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
            System.out.println(dateFormatter.format(bbirthday));
        } else if (Objects.equals(format, "длинный")) {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
            System.out.println(dateFormatter.format(bbirthday));
        }
    }
        @Override
        public String toString() {
        String b = "";
            if (Objects.equals(format, "короткий")) {
                SimpleDateFormat dateFormatter = new
                        SimpleDateFormat("EEEE, MMMM d, yyyy");
                b = dateFormatter.format(bbirthday);
            } else if (Objects.equals(format, "средний")) {
                SimpleDateFormat dateFormatter = new
                        SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
                b = dateFormatter.format(bbirthday);
            } else if (Objects.equals(format, "длинный")) {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
                b = dateFormatter.format(bbirthday);
            }
            return "name: " + name + " surname: " + surname + " возраст: " + age + " группа: " + group + " ДР: " +
                    b;
        }

}

