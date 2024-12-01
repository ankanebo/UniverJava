public class LinkedList {
   int data;
   LinkedList next;

   public LinkedList(int newData){
       this.data = newData;
       this.next = null;
   }
   public LinkedList(){}
   public int getDate(){
       return this.data;
   }
   public LinkedList getNext(){
       return next;
   }
}
