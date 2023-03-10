import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        ArrayList list = new ArrayList<>();
        

        Iterator iter = list.iterator();
        while (iter.hasNext()){

            System.out.println(iter.next());
        }


    }
    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection); // Вот и всё!
    }
}

