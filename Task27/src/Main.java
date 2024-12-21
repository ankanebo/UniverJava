import java.util.Hashtable;
public class Main {
    public static void main(String[] args) {
        HashTab ht = HashTab.hashtabInit();
        ht.hashtabAdd("cat");
        ht.hashtabAdd("dog");
        ht.hashtabAdd("parrot");
        ht.hashtabAdd("rabbit");
        ht.hashtabAdd("bony");
        ht.hashtabAdd("frog");
        ht.hashtabAdd("fish");
        ht.hashtabAdd("sparrow");
        ht.hashTabValue();
        System.out.println(ht.hashtabLookup(52));
        ht.hashtabDelete(46);
        ht.hashTabValue();
    }
}