import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("Eat");
        hs.add("love");
        hs.add("game");
        hs.add("sport");
        Set<String> hashSetToTreeSet = new TreeSet<>(hs);
        Map mp = new Map();
        mp.createMap();
        System.out.println(mp.getSameFirstName());
        System.out.println(mp.getSameLastName());
        HashTab ht = new HashTab();
        ht.hashtabAdd("cat");
        ht.hashtabAdd("dog");
        ht.hashtabAdd("parrot");
        ht.hashtabAdd("bony");
        ht.hashtabAdd("frog");
        ht.hashtabAdd("fish");
        ht.hashtabAdd("sparrow");
        ht.hashTabValue();
    }
}