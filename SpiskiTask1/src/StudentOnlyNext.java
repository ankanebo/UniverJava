public class StudentOnlyNext {
    private final Student start;
    private int Count;
    public StudentOnlyNext() {
        this.start = new Student();
        Count = 0;
    }
    public boolean isEmpty(){
        return start.getNext() == null;
    }
    public void add(){
        Student tmp = new Student();
        tmp.input();
        Student current = this.start;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(tmp);
        Count++;
    }
    public void add(int index){
        Student tmp = new Student();
        tmp.input();
        Student current = start;
        for (int i=1; i<index && current.getNext() != null; i++){
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        current.setNext(tmp);
        Count++;
    }
    public Object get(int index){
        if (Math.abs(index) >= Count) return null;
        Student current = start.getNext();
        if (index < 0){
            for (int i = 0; i < Count + index; i++){
                if (current.getNext() == null) return null;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) return null;
                current = current.getNext();
            }
        }
        return current.getData();
    }
    public void remove(int index){
        if (Math.abs(index) >= Count) return;
        Student current = start;
        if (index < 0){
            for (int i = 0; i < Count + index; i++){
                if (current.getNext() == null) return;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) return;
                current = current.getNext();
            }
        }
        if (index == Count-1 || index == -1){
            current.setNext(null);
        }else{
            current.setNext(current.getNext().getNext());
        }
        Count--;
    }
    public void clear(){
        start.setNext(null);
    }
    public int size(){ return Count; }
    @Override
    public String toString() {
        if (start.getNext() == null){
            return "Студентов нет";
        }else {
            Student current = start.getNext();
            String output = "";
            while (current != null){
                output += "[" + current.getData().toString() + "]";
                current = current.getNext(); }
            return output;
        }

    }
}
