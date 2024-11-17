import javax.swing.*;
import java.util.Comparator;
import java.util.Scanner;

public class MinMax<T extends Comparable<T>> {
    T[] mass;
    public MinMax(T[] mass){
        this.mass = mass;
    }

    public T GetMax(){
        if(mass.length == 0){
            return null;
        }
        T max = mass[0];
        for(int i = 1; i < mass.length; i++){
            if(max.compareTo(mass[i]) > 0){
                max = mass[i];
            }
        }
        return max;
    }

    public T getMin(){
        if(mass.length == 0){
            return null;
        }
        T min = mass[0];
        for(int i = 1; i < mass.length; i++){
            if(min.compareTo(mass[i]) < 0){
                min = mass[i];
            }
        }
        return min;
    }
}

