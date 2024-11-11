//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TwoLinkedList listHeight = new TwoLinkedList();
        listHeight.add(2);
        listHeight.add(5);
        listHeight.add(23);
        listHeight.add(7);
        listHeight.add(10);
        listHeight.add(6, 0);
        System.out.println(listHeight.size());
        //listHeight.add(6, 3);
        System.out.println(listHeight.size());
        System.out.println(listHeight.get(4));
        System.out.println(listHeight.min(0));
        System.out.println(listHeight.min(2));
        System.out.println(listHeight.min(1));

        listHeight.sortedList();
    }
}