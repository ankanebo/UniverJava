public class ThrowsDemo {
    public String getDetails(String key){
        if (key == null){
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    public void printMessage(String key){
        try {
            System.out.println(getDetails(key));
        } catch (Exception e){
            System.out.println("null key in getDetails, need in new key");
        }
    }
}
