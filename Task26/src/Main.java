import java.util.Iterator;
import java.util.Stack;
public class Main{
    public static void main(String[] args) {
        Stack<Integer> si = new Stack<>();

        int[] mas = {1,2,3,4,5,6};
        for (int i = 0;i < (mas.length / 2);i++){
            si.push(mas[mas.length - i - 1]);
            si.push(mas[i]);
            Iterator<Integer> iterator = si.iterator();
            while (iterator.hasNext()){
                mas[i] = iterator.next();
                mas[mas.length - i - 1] = iterator.next();
            }
        }
        System.out.println("Выводим массив");
        for (int i = 0; i < 6; i++) {
            System.out.println(mas[i]);
        }
        LinkedMyList lml = new LinkedMyList();
        lml.add(5);
        lml.add(9);
        lml.add(10);
        lml.add(3);
        System.out.println("Следующий элемент:"+lml.next());
        System.out.println("Следующий элемент:"+lml.next());
        System.out.println("Следующий элемент:"+lml.next());
        System.out.println("Предыдущий элемент:"+lml.previous());
        System.out.println("Индекс следующего элемента:"+lml.nextIndex());
        System.out.println("Индекс предыдущего элемента:"+lml.previousIndex());
        lml.remove();
        System.out.println("Имеется ли следующий элемент:"+lml.hasNext());
        System.out.println("Имеется ли предыдущий элемент:"+lml.hasPrevious());
    }
}