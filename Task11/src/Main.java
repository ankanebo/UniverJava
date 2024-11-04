import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        DateTask dt = new DateTask();
        dt.surnameDate();
        dt.compareDate();
        Student t = new Student("fgg", "h", "g", 34, new Date(2002, 3, 4));
        t.birthday();
        System.out.println(t);
        ArrayList<String> people = new ArrayList<String>();
        LinkedList<String> states = new LinkedList<String>();

//      добавление элемента в массив
        long startTime = System.currentTimeMillis();
        people.add("Tom");
        long arrayListTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        states.add("Germany");
        long linkedListTime = System.currentTimeMillis() - startTime;

        if (arrayListTime > linkedListTime){
            System.out.println("linkedList более производительный в добавлении элемента");
        }
        else if (arrayListTime < linkedListTime){
            System.out.println("arrayList более производительный в добавлении элемента");
        }
        else{
            System.out.println("linkedList и arrayList одинаковой производительности в добавлении элемента");
        }

//      вставка элемента в массив
        startTime = System.currentTimeMillis();
        people.add(1, "Bob");
        arrayListTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        states.add(1, "Italy");
        linkedListTime = System.currentTimeMillis() - startTime;


        if (arrayListTime > linkedListTime){
            System.out.println("linkedList более производительный в ставке элемента");
        }
        else if (arrayListTime < linkedListTime){
            System.out.println("arrayList более производительный в ставке элемента");
        }
        else{
            System.out.println("linkedList и arrayList одинаковой производительности в ставке элемента");
        }

//      удаление элемента из массива
        startTime = System.currentTimeMillis();
        people.remove("Bob");
        arrayListTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        states.remove("Italy");
        linkedListTime = System.currentTimeMillis() - startTime;


        if (arrayListTime > linkedListTime){
            System.out.println("linkedList более производительный в удалении элемента");
        }
        else if (arrayListTime < linkedListTime){
            System.out.println("arrayList более производительный в удалении элемента");
        }
        else{
            System.out.println("linkedList и arrayList одинаковой производительности в удалении элемента");
        }

//      поиск элемента по образцу
        startTime = System.currentTimeMillis();
        if(people.contains("Tom")){
            System.out.println("ArrayList contains Tom");
        }
        arrayListTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        if(states.contains("Germany")){
            System.out.println("LinkedList contains Italy");
        }
        linkedListTime = System.currentTimeMillis() - startTime;


        if (arrayListTime > linkedListTime){
            System.out.println("linkedList более производительный в поиске элемента по образцу");
        }
        else if (arrayListTime < linkedListTime){
            System.out.println("arrayList более производительный в в поиске элемента по образцу");
        }
        else{
            System.out.println("linkedList и arrayList одинаковой производительности в поиске элемента по образцу");
        }
    }
}
//чт, 2003-4-3 at 12:0:0 AM MSK