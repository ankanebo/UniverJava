//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Задание #2
        Common<Integer, Double, String> cm = new Common<Integer, Double, String>(23, 34.22,"Anna");
        System.out.println(cm.getClassFirst());
        System.out.println(cm.getClassSecond());
        System.out.println(cm.getClassThird());
        cm.setFirst(54);
        System.out.println(cm.getFirst());
        cm.setSecond(45.78);
        System.out.println(cm.getSecond());
        cm.setThird("Gosha");
        System.out.println(cm.getThird());

        Integer[] mass = {100,25,43,6,200};
        MinMax<Integer> mm = new MinMax<Integer>(mass);
        System.out.println("Максимальное значение: " + mm.GetMax());
        System.out.println("Минимальное значение: " + mm.getMin());

        String[] mass1 = {"hfjdk", "ghdsjk", "efdhsj", "a"};
        MinMax<String> mm1 = new MinMax<String>(mass1);
        System.out.println("Максимальное значение: " + mm1.GetMax());
        System.out.println("Минимальное значение: " + mm1.getMin());

        Integer x = 4;
        Double y = 5.4;
        Calculator.sum(x, y);
        Calculator.divide(x, y);
        Calculator.multiply(x, y);
        Calculator.subtraction(x, y);

    }
}
