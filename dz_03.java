import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;

/**
 * dz_03
 */
public class dz_03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello World");
        list.add("I Love Java");
        list.add("And Java Loves Me");
        
        // Задание 2
        // ListIterator<String> iterator = list.listIterator();
        // while (iterator.hasNext()) {          
        //     iterator.add(list.get(iterator.nextIndex()) + "!");
        //     iterator.next();
        //     iterator.remove();
        // }
        list.add(0, "First");
        // System.out.println(list.get(2));  
        list.set(0, "Refresh First");
        list.forEach( (k) -> System.out.println(k));
        // System.out.println(list.indexOf("Hello World"));
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hello World");
        list2.add("Python is better");
        list.retainAll(list2);
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            arrayList.add(rnd.nextInt(8));
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}