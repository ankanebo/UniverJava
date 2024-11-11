public class Height {
    int meters;
    Height next;
    Height previous;

    public Height(int meters){
        this.meters = meters;
        next = null;
        previous = null;
    }
    public Height(){}
    public Height(int meters, Height next){
        this.meters = meters;
        this.next = next;
        previous = null;
    }
    public Height(int meters, Height next, Height previous){
        this.meters = meters;
        this.next = next;
        this.previous = previous;
    }
    public int getData(){
        return meters;
    }
    public void setData(int meters){
        this.meters = meters;
    }
    public Height getNext(){
        return next;
    }
    public void setNext(Height next){
        this.next = next;
        next.previous = this;
    }
    public Height getPrevious(){
        return previous;
    }
    public void setPrevious(Height previous){
        this.previous = previous;
        previous.next = this;
    }

    @Override
    public String toString() {
        String output ="";
        output = "Height="+meters;
        return output;
    }

}
