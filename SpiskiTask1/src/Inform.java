public class Inform {
    String name;
    int age;
    String group;
    String surname;
    public Inform(String name, int age, String group, String surname){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;

    }
    @Override
    public String toString(){
        return "имя и фамилия студента: " + this.name + this.surname + "возраст: " + this.age + "группа студента: " + this.group;
    }
}
