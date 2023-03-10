import java.lang.reflect.Array;
import java.util.*;
public class ff {
    public static class Util{
        public static <T>T getValue(Object obj){
            return (T) obj;
        }
    }

    public static void main(String[] args) {
        List list = Arrays.asList("1",5);

        for(Object obj:list){
            System.out.println(Util.<String>getValue(obj));
        }
    }

//    public static class Util {
//        public static <T> T getValue(Object obj) {
//            return (T) obj;
//        }
//    }
//
//    public static void main(String []args) {
//        List list = Arrays.asList("2", "3");
//        for (Object element : list) {
//            System.out.println(Util.<String>getValue(element)+1);
//        }
//    }
}