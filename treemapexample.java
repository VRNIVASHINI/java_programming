import java.util.TreeMap;

public class treemapexample {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(103, "arun");
        map.put(110, "bala");
        map.put(105, "barath");
        map.put(120, "david");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.higherKey(105));
        System.out.println(map.lowerKey(105));
        System.out.println(map.descendingMap());
    }
}
  






