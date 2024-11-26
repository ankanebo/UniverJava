public class Address{
    String adr;
    String country;
    String region;
    String street;
    String house;
    String flat;
    String korpus;
    String town;
    public Address(String adr){
        this.adr = adr;
        String[] addr = adr.split(",");
        this.country = addr[0];
        this.region = addr[1];
        this.town = addr[2];
        this.street = addr[3];
        this.house = addr[4];
        this.korpus = addr[5];
        this.flat = addr[6];
    }

    void saveAddress(){
        String[] addr = adr.split(",");
        this.country = addr[0];
        this.region = addr[1];
        this.town = addr[2];
        this.street = addr[3];
        this.house = addr[4];
        this.korpus = addr[5];
        this.flat = addr[6];
    }
    void setAdr(String str){
        this.adr = str;
        //System.out.println(adr);
        String[] addr = adr.split(",");
        this.country = addr[0];
        this.region = addr[1];
        this.town = addr[2];
        this.street = addr[3];
        this.house = addr[4];
        this.korpus = addr[5];
        this.flat = addr[6];
    }
    void printAddress(){
        System.out.println(country + ", " + region + ", " + town + ", " + street + ", " + house + ", " + korpus + ", " + flat);
    }
}
