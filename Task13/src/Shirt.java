import java.lang.Override;
public class Shirt {
    String elem;
    String size;
    String color;
    String name;
    String number;

    public Shirt(String elem){
        this.elem = elem;
        String[] mas = elem.split(",");
        this.size = mas[3];
        this.color = mas[2];
        this.number = mas[0];
        this.name = mas[1];
    }
    public Shirt(){}
    void setShirt(String str){
        String[] mas = str.split(",");
        this.size = mas[3];
        this.color = mas[2];
        this.number = mas[0];
        this.name = mas[1];
    }
    void masDone(String[] shirts){
        //Shirt sh = new Shirt();
        Shirt[] mas = new Shirt[11];
        for (int i = 0; i < (shirts.length); i++){
            Shirt sh = new Shirt(shirts[i]);
            mas[i] = sh;
            System.out.println(mas[i].toString());
        }
    }
    @Override
    public String toString(){
    return "Размер: " + size +
            " Цвет: " + color +
            " Серийный номер: " + number +
            " Наименование: " + name;
    }
}
