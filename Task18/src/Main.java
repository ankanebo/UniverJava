//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exception1 ex1 = new Exception1();
        ex1.exceptionDemo();
        Exception2 ex2 = new Exception2();
        ex2.exceptionDemo();
        ex2.exceptionDemo2();
        ThrowsDemo td = new ThrowsDemo();
        td.printMessage(null);
        td.printMessage("normal key");
        ThrowsDemo2 td2 = new ThrowsDemo2();
        td2.getKey();
        ThrowsDemo3 td3 = new ThrowsDemo3();
        td3.getKey();
    }
}