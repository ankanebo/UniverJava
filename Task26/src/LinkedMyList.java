public class LinkedMyList implements IteratorList{
    private final Node start;
    private final Node end;
    private Node current;
    int index;
    private int count;
    public LinkedMyList() {
        this.start = new Node();
        count = 0;
        this.end = new Node();
        start.setNext(end);
        index = 0;
        current = start;
    }
    public int next(){
        current = current.getNext();
        index += 1;
        return current.getData();
    }
    public int previous(){
        current = current.getPrevious();
        index -= 1;
        return current.getData();
    }
    public boolean isEmpty(){
        return start.getNext() == end;
    }
    public void add(int elem){
        Node tmp = new Node();
        tmp.setData(elem);
        Node current = this.start;
        while (current.getNext() != end){
            current = current.getNext();
        }
        end.setPrevious(tmp);
        current.setNext(tmp);
        count++;
    }
//    public void add(int index){
//        MyList tmp = new MyList();
//        tmp.setData();
//        MyList current = start;
//        for (int i=1; i<index && current.getNext() != end; i++){
//            current = current.getNext();
//        }
//        tmp.setNext(current.getNext());
//        tmp.setPrevious(current);
//        count++;
//    }
    public int previousIndex(){
        return index-1;
    }
    public boolean hasNext(){
        return current.next != null;
    }
    public boolean hasPrevious(){
        return current.previous != null;
    }
    public void remove(){
        current.previous.setNext(current.next);
        current.next.setPrevious(current.previous);
    }
    public int nextIndex(){
        return index+1;
    }
    public Object get(int index){
        if (Math.abs(index) >= count) return null;
        Node current = start.getNext();
        if (index < 0){
            for (int i = 0; i < count + index; i++){
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
        return current.getData();
    }

    public void remove(int index){
        if (Math.abs(index) >= count) return;
        Node current = start;
        if (index < 0){
            for (int i = 0; i < count + index; i++){
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
        if (index == count-1 || index == -1){
            current.setNext(end);
        }else{
            current.setNext(current.getNext().getNext());
        }
        count--;
    }
    public void clear(){
        start.setNext(end);
    }
    public int size(){ return count; }
}

