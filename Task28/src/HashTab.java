import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class HashTab {
        int count = 0;
        Map<Double, String> dict;

        Hashtable<String, Integer> hashtable;
        public HashTab(){
            int count = 0;
            this.dict = new HashMap<Double, String>();
        }

        public void hashtabAdd(String elem){
            double key = hashtabHash(elem);
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
            for(Map.Entry<Double, String> item : dict.entrySet()){

                System.out.println("Key: " + item.getKey() +" Value: " + item.getValue());
            }
        }
        public static HashTab hashtabInit(){
            HashTab ht = new HashTab();
            return ht;
        }
        public String hashtabLookup(int key){
            return dict.get(key);
        }
        public double hashtabHash(String elem){
            double hash = 0;
            String[] elemm = elem.split("");
            String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                    "m", "n", "o", "p", "q", "r", "s", "t","u", "v", "w", "x", "y", "z"};
            for (int i = 0; i < elem.length(); i++){
                for (int n = 1; n < alphabet.length + 1; n++){
                    if (Objects.equals(elemm[i], alphabet[n - 1])){
                        double h = n * (1.0);
                        hash += (Math.round((i/h) * 100.0)) / 100.0;
                    }
                }
            }
            return hash;
        }
}
