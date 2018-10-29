import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class HelloWorld{
    List<String> list = new ArrayList<String>();
    Random r = new Random();
    
    public HelloWorld(){}
    
    public static void main(String []args){
    HelloWorld hw = new HelloWorld();
    hw.addList("Hello Bro, ");
    hw.printList();
    }
 
     public void addList(String x){
        for(int i = 1; i<=1000;i++){
            list.add(x + i);
        }
     }
     
     public void printList(){
        for(int i = 0; i <=list.size(); i++) {
            int randomIndex = r.nextInt(list.size()) + 0;
            String greeting = list.get(randomIndex);
            System.out.println(greeting);
            list.remove(randomIndex);
        }
     }
}
