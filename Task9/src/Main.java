import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Random rand = new Random();
        Student[] St = new Student[k];
        int[] ides = new int[k];
        for (int i = 0; i < k; i++){
            Student a = new Student(rand.nextInt(1000), "john", rand.nextInt(4), 17);
            St[i] = a;
            ides[i] = St[i].id;
            //System.out.println(h[i]);
        }
        Sort.insertionSort(ides);
        for(int i = 0; i < k; i++){
            System.out.println(ides[i]);
        }
    }

}
