public class StudentNextPreviousPerform {
    private final StudentNextPrevious start;
    private final StudentNextPrevious end;
    private int count;
    public StudentNextPreviousPerform() {
        this.start = new StudentNextPrevious();
        count = 0;
        this.end = new StudentNextPrevious();
        start.setNext(end);
    }
    public boolean isEmpty(){
        return start.getNext() == end;
    }
    public void add(){
        StudentNextPrevious tmp = new StudentNextPrevious();
        tmp.input();
        StudentNextPrevious current = this.start;
        while (current.getNext() != end){
            current = current.getNext();
        }
        end.setPrevious(tmp);
        current.setNext(tmp);
        count++;
    }
    public void add(int index){
        StudentNextPrevious tmp = new StudentNextPrevious();
        tmp.input();
        StudentNextPrevious current = start;
        for (int i=1; i<index && current.getNext() != end; i++){
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        tmp.setPrevious(current);
        count++;
    }
    public Object get(int index){
        if (Math.abs(index) >= count) return null;
        StudentNextPrevious current = start.getNext();
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
        StudentNextPrevious current = start;
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
    @Override
    public String toString() {
        if (start.getNext() == end){
            return "всех студентов отчислили";
        }else {
            StudentNextPrevious current = start.getNext();
            String output = "";
            while (current != end){
                output += "[" + current.getData().toString() + "]";
                current = current.getNext(); }
            return output;
        }

    }
}

