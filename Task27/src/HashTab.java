import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class HashTab {
    int count = 0;
    Map<Integer, String> dict;

    Hashtable<String, Integer> hashtable;
    public HashTab(){
        int count = 0;
        this.dict = new HashMap<Integer, String>();
    }

    public void hashtabAdd(String elem){
        int key = hashtabHash(elem);
        dict.put(key, elem);
        count += 1;
    }
    public void hashtabDelete(int key){
        if (count == 0){
            System.out.println("HashTable is empty");
            count = 0;
        }
        else {
            dict.remove(key);
            count -= 1;
            System.out.println("Элемент с ключом " + key + " удален");
        }
    }
    public void hashTabValue(){
        for(Map.Entry<Integer, String> item : dict.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }
    public static HashTab hashtabInit(){
        HashTab ht = new HashTab();
        return ht;
    }
    public String hashtabLookup(int key){
        return dict.get(key);
    }
    public int hashtabHash(String elem){
        int hash = 0;
        String[] elemm = elem.split("");
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z"};
        for (int i = 0; i < elem.length(); i++){
            for (int n = 0; n < alphabet.length; n++){
                if (Objects.equals(elemm[i], alphabet[n])){
                    hash += n;
                }
            }
        }
        return hash;
    }
}
