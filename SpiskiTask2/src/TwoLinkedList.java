import static java.lang.StrictMath.pow;
import java.math.*;
public class TwoLinkedList {
    Height start;
    Height end;
    private int countList;

    public TwoLinkedList(){
        start = new Height();
        end = new Height();
        countList = 0;
        start.setNext(end);
    }

    public void add(int meters){
        Height mt = new Height(meters);
        Height current = start;
            while (current.getNext() != end) {
                current = current.getNext();
            }
            end.setPrevious(mt);
            current.setNext(mt);
            countList++;
//        current = start.getNext();
//        for (int i = 0; i < countList && current.getNext() != end; i++){
//            current = current.getNext();
//            System.out.println(current);
//        }
    }
//    public void addFirst(int meters){
//        Height mt = new Height(meters, start.getNext().getNext(), start);
////        mt.setPrevious(start);
////        mt.setNext(start.getNext());
//        countList += 1;
//
//
//        Height current = start.getNext();
//        for (int i = 0; i< countList && current.getNext() != end; i++){
//            current = current.getNext();
//            System.out.println(current);
//        }
//
//    }
    public void add(int meters, int index){
        Height mt = new Height(meters);
        Height current = start;
        for (int i = 0; i < index && current.getNext() != end; i++){
            current = current.getNext();
        }
        mt.setNext(current.getNext());
        mt.setPrevious(current);
        countList++;


//        current = start;
//        for (int i = 0; i< countList && current.getNext() != end; i++){
//            current = current.getNext();
//            System.out.println(current);
//        }
    }

    public void remove(int index){
        if (Math.abs(index) >= countList) return;
        Height current = start;
        if (index < 0){
            for (int i = 0; i < countList + index; i++){
                if (current.getNext() == end) return;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == end) return;
                current = current.getNext();
            }
        }
        if (index == countList-1 || index == -1){
            current.setNext(end);
        }else{
            current.setNext(current.getNext().getNext());
        }
        countList--;
    }

    public Height get(int index){
        if (Math.abs(index) >= countList) return null;
        Height current = start.getNext();
        if (index < 0){
            for (int i = 0; i < countList + index; i++){
                if (current.getNext() == end) return null;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == end) return null;
                current = current.getNext();
            }
        }
        return current;
    }

    public int min(int cnt){
        Height current = start;
        Height min = new Height(1000000000);
        int count = 0;
        for (int i = 0; i < countList && current.getNext() != end; i++){
            current = current.getNext();
            if (i >= cnt) {
                if (min.getData() >= current.getData()) {
                    min = current;
                    count = i;
                }
            }
        }
        return count;
    }

    public void sortedList(){
        Height current = start;
        //TwoLinkedList search = new TwoLinkedList();
        int mt;
        for (int i = 0; i < countList; i++){
            int index = this.min(i);
            mt = this.get(index).getData();
            //System.out.println(mt.getData());
            this.remove(index);
            this.add(mt, 0);
        }
        current = start;
        for (int i = 0; i< countList; i++){
            current = current.getNext();
            System.out.println(current);
        }
    };
    public int size(){ return countList; }

}
