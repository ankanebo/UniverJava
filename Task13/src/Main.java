import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Person p = new Person("Podnebesnova", "Anna", "Ale");
        p.printFIO();
        telefonNumber tn = new telefonNumber("+79165777298");
        tn.formatNum();
        tn.setNum("+1046739027401");
        tn.formatNum();
        Address ad = new Address("sdfghj, dfsg, sdfgh, sdfgh, sdfghj, sdfghj, sdgfhj");
        ad.setAdr("Россия,Москва,Москва,Соколово-Мещерская,25,3,23");
        ad.printAddress();
        Shirt shir = new Shirt();
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        shir.masDone(shirts);
        Scanner scanner = new Scanner(new File("src/file.txt"));
        String[] file = scanner.nextLine().split(" ");
        String[] res = new String[file.length];
        for (int q = 0; q < file.length; q++){
            String a = file[q];
            file[q] = "";
            sor(a, file, 0, res);
            file[q] = a;
        }
    }
    public static void sor(String cur, String[] left, int index, String[] res){
        res[index] = cur;
        if (index == left.length - 1){
            System.out.println(Arrays.toString(res));
            return;
        }
        for ( int q = 0; q< left.length; q++){
            if (!Objects.equals(left[q], "") && cur.charAt(cur.length()-1) == left[q].charAt(0)){
                String a = left[q];
                left[q] = "";
                sor(a, left, index+1, res);
                left[q] = a;
            }
        }
    }
}
