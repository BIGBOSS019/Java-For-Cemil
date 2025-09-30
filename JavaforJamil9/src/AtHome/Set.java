package AtHome;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        TreeSet<String> ts = new TreeSet<String>();


        hs.add("Baku");
        hs.add("Dubai");
        hs.add("Moldivi");
        hs.add("Japan");
        hs.add("Mekka");

        ts.add("1");
        ts.add("7");
        ts.add("2");
        ts.add("5");
        ts.add("3");
        ts.add("4");
        ts.add("6");

        System.out.println(hs);
        System.out.println(ts);

    }
}
