public class TestAbstractAndLinkedQueue {
    public static void main(String[] args) {
//        Проверка абстрактного класса (ArrayQueueADT)
        TestArrayQueueADT taq = new TestArrayQueueADT(5);
        taq.enqueue(6);
        taq.enqueue(10);
        //System.out.println(taq.element());
        taq.enqueue(4);
        System.out.println(taq.dequeue());
        System.out.println(taq.dequeue());
        System.out.println("Пустой: " + taq.isEmpty());
        System.out.println(taq.dequeue());
        System.out.println(taq.size());
        taq.enqueue(78);
        taq.printQueue();

//        Проверка очереди на связном списке (LinkedQueue), сам связный список LinkedList
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(6);
        lq.enqueue(8);
        System.out.println(lq.element());
        System.out.println("Пустой: " + lq.isEmpty());
        System.out.println(lq.size());
        System.out.println(lq.dequeue());
        System.out.println(lq.dequeue());
        System.out.println(lq.size());
        lq.enqueue(78);
        lq.enqueue(24);
        lq.enqueue(98);
        System.out.println(lq.size());
        lq.clear();
        System.out.println("Пустой: " + lq.isEmpty());
    }
}
