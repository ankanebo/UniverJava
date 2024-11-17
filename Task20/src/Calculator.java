public class Calculator {
    public static <T extends Number,V extends Number> void sum(T x, V y){
        double sum = 0.0;
        sum += x.doubleValue();
        sum += y.doubleValue();
        System.out.println(sum);
    }
    public static <T extends Number,V extends Number> void subtraction(T x, V y){
        double sub = 0.0;
        sub = x.doubleValue();
        sub -= y.doubleValue();
        System.out.println(sub);
    }

    public static <T extends Number, V extends Number> void multiply(T x, V y){
        double mul = 1.0;
        mul *= x.doubleValue();
        mul *= y.doubleValue();
        System.out.println(mul);
    }
    public static <T extends Number, V extends Number> void divide(T x, V y){
        double div = 0.0;
        div = x.doubleValue();
        div = div / y.doubleValue();
        System.out.println(div);
    }
}
