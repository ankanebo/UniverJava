import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack {
    private int[] array;
    private int top;
    private int capacity;

    Stack(int size){
        array = new int[size];
        capacity = size;
        top = -1;
    }

    private Boolean checkElement(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    private int findNumbers(String example){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(example);
        int numbers = 0;
        while(matcher.find()) {;
            numbers++;
        }
        return numbers;
    }
    private Boolean checkExample(String example){
        //StringTokenizer st = new StringTokenizer(example, "+*/-", true);
        String check = "0123456789+-*/";
        //boolean flag1 = false;
        boolean flag2 = false;
        int count = 0;
        String[] mass = example.split("");
        for (int i = 0;i<example.length(); i++){
            if (check.contains(mass[i])){
                count += 1;
            }
        }
        if(count == example.length()){
            flag2 = true;
        }
//        while (st.hasMoreTokens()){
//            String elem = st.nextToken();
//            flag1 = check.contains(elem);
//        }
        return flag2 && (example.length() - findNumbers(example) == findNumbers(example) - 1);

    }

    public void getExample(String example) {
        if (checkExample(example)) {
            String[] mass = example.split("");
            this.push(Integer.parseInt(mass[0]));
            while (!isEmpty()) {
                for (int i = 1; i < example.length(); i++) {
                    if (!checkElement(mass[i])) {
                        if (Objects.equals(mass[i], "+")) {
                            int el1 = this.pop();
                            int el2 = this.pop();
                            this.push(el1 + el2);
                        } else if (Objects.equals(mass[i], "-")) {
                            int el1 = this.pop();
                            int el2 = this.pop();
                            this.push(el1 - el2);
                        } else if (Objects.equals(mass[i], "*")) {
                            int el1 = this.pop();
                            int el2 = this.pop();
                            this.push(el1 * el2);
                        } else if (Objects.equals(mass[i], "/")) {
                            int el1 = this.pop();
                            int el2 = this.pop();
                            this.push(el1 / el2);
                        }
                    } else {
                        this.push(Integer.parseInt(mass[i]));
                    }
                }
                System.out.println(example + "=" + this.pop());
            }
        }
        else{
            System.out.println("пример " + example + " введен в неправильном формате");
        }
    }

    public void push(int x){
        if (isFull()){
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        //System.out.println("Inserting " + x);
        array[++top] = x;
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack empty");
            System.exit(1);
        }
        return array[top--];
    }
    public int getSize(){
        return top + 1;
    }
    public Boolean isEmpty(){
        return top == -1;
    }
    public Boolean isFull(){
        return top == capacity - 1;
    }
    public void printStack(){
        for (int i = 0; i <= top; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
