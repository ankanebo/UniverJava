public class Person {
    String surname;
    String name;
    int count;
    String secondName;
    public Person(String surname, String name, String secondName){
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.count = 3;
    }
    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
        this.count = 2;
    }
    public Person(String surname){
        this.surname = surname;
        this.count = 1;
    }
    void setSurname(String str){
        this.surname = str;
        System.out.println(surname);
    }

    void setName(String str){
        this.name = str;
        System.out.println(name);
    }

    void setSecondName(String str){
        this.secondName = str;
        System.out.println(secondName);
    }

    void printFIO(){
        switch(count){
            case 1:
                System.out.println(surname);
            case 2:
                System.out.println(surname + " " + name.charAt(0));
            case 3:
                System.out.println(surname + " " + name.charAt(0) + " " + secondName.charAt(0));
        }
    }
}
