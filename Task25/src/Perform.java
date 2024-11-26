import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Perform {
    static void findVal(String str){
        Pattern pattern = Pattern.compile("(\\d*).(\\d*\\s?)USD|(\\d*).(\\d*\\s?)EU|(\\d*).(\\d*\\s?)RUB|(\\d*\\s?)USD|(\\d*\\s?)EU|(\\d*\\s?)RUB");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find())
            System.out.println(matcher.group());
    }
    static void checkEmail(String email){
        Pattern pattern = Pattern.compile("([a-z0-9_]+)@([a-z]+)|([a-z0-9_]+)@([a-z]+.[a-z]+)");
        Matcher matcher = pattern.matcher(email);
        System.out.println(email + " : " + matcher.matches());

    }
    static void checkDate(String date) {
        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.]([1-9][0-9])\\d\\d");
        Matcher matcher = pattern.matcher(date);
        System.out.println(date + " : " + matcher.matches());
    }
}


