public class telefonNumber {
    String num;
    public telefonNumber(String num){
        this.num = num;
    }
    void setNum(String number){
        this.num = number;
        System.out.println(num);
    }
    void formatNum(){
        String kod = num.substring(0, num.length() - 10);
        String str3 = num.substring(num.length() - 4);
        String str2 = num.substring(num.length() - 7, num.length() - 4);
        String str1 = num.substring(num.length() - 10, num.length() - 7);
        String[] words = {kod, str1, str2, str3};
        String format = String.join("-", words);
        System.out.println(format);
    }
}
