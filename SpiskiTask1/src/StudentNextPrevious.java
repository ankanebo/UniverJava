import java.util.Scanner;

public class StudentNextPrevious {
    String surname;
    String name;
    String group;
    int age;
    StudentNextPrevious next;
    StudentNextPrevious previous;

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
    void setNext(StudentNextPrevious st){
        this.next = st;
        st.previous = this;
    }
    StudentNextPrevious getNext(){
        return next;
    }

    void setPrevious(StudentNextPrevious st){
        this.previous = st;
        st.next = this;
    }

    public Object getData() { return new Inform(this.name, this.age, this.group, this.surname); }
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

    @Override
    public String toString() {
        String output ="";
        output = "имя и фамилия студента: " + this.name + this.surname + "возраст: " + this.age + "группа студента: " + this.group;
        return output;
    }
}
