public class Common <T, V, K> {
    T first;
    V second;
    K third;
    public Common(T first, V second, K third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(V second){
        this.second = second;
    }

    public void setThird(K third){
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public Class<?> getClassFirst(){
        return first.getClass();
    }
    public Class<?> getClassSecond(){
        return second.getClass();
    }
    public Class<?> getClassThird(){
        return third.getClass();
    }

    @Override
    public String toString(){
        return "First: " + first + "Second: " + second + "Third: " + third;
    }
}
