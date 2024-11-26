public class Perform {
    String str;
    public Perform(String str){
        this.str = str;
    }
    void setStr(String str){
        System.out.println(str);
    }
    void printStr(String str){
        System.out.println(str);
    }
    void lastEl(){
        System.out.println(str.charAt(str.length() - 1));
    }
    void lastPodstroka(){
        if (str.endsWith("!!!")){
            System.out.println("Подстрока заканчивается !!!");
        }
        else{
            System.out.println("Подстрока не заканчивается !!!");
        }
    }
    void firstPodstroka(){
        if (str.startsWith("i like")){
            System.out.println("Подстрока начинается i like");
        }
        else{
            System.out.println("Подстрока начинается i like");
        }
    }
    void partStr(){
        if (str.contains("Java")){
            System.out.println("Подстрока Java есть");
        }
        else{
            System.out.println("Подстрока Java нет");
        }
    }
    void indexJava(){
        System.out.println("I like Java!!!".indexOf("Java"));
    }
    void replaceAo(){
        System.out.println(str.replace('a', 'o'));
    }
    void lowerStr(){
        System.out.println(str.toLowerCase());
    }
    void upperStr(){
        System.out.println(str.toUpperCase());
    }
    void subStr(){
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }

}