import java.lang.*;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class MathFunc implements MathCalculable{
    int num;
    int exp;
    public MathFunc(int num, int exp){
        this.num = num;
        this.exp = exp;
    }

    public void exponentiation(){
        System.out.println(pow(num, exp));
    }

    public void module() {
        System.out.println(abs(num));;
    }

}
