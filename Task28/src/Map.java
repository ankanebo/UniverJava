import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Map {
    HashMap<String, String> mp;
    public Map() {
        mp = new HashMap<String, String>();
    }
    public HashMap createMap(){
        mp.put("Банный", "Глеб");
        mp.put("Поднебеснова", "Анна");
        mp.put("Иванов", "Георгий");
        mp.put("Файзуллина", "Ильзира");
        mp.put("Губский", "Андрей");
        mp.put("Бугакова", "Алина");
        mp.put("Соловьева", "Анастасия");
        mp.put("Могирев", "Павел");
        mp.put("Румянцев", "Андрей");
        mp.put("Банный", "Андрей");
        return mp;
    }
    public int getSameFirstName(){
        int count = 0;
        ArrayList<String> used = new ArrayList<>();
        for(HashMap.Entry<String, String> item : mp.entrySet()){
            for(HashMap.Entry<String, String> item1 : mp.entrySet()){
                if (!Objects.equals(item.getKey(), item1.getKey()) && Objects.equals(item.getValue(), item1.getValue()) && (!used.contains(item.getKey()) || !used.contains(item1.getKey()))){
                    count+=1;
                    used.add(item.getKey());
                    used.add(item1.getKey());
                }
            }
        }
        return count + 1;
    }
    public int getSameLastName(){
        int count = 0;
        for(HashMap.Entry<String, String> item : mp.entrySet()){
            for(HashMap.Entry<String, String> item1 : mp.entrySet()){
                if (Objects.equals(item.getKey(), item1.getKey())){
                    count+=1;
                }
            }
        }
        return count - 9;
    }
}
