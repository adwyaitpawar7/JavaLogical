import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mappractice {
  public static void main(String[] args) {
    Map<Integer, String> m = new HashMap<>();
    m.put(1, "Adwyait");
    m.put(2, "Asshsish");
    m.put(3, "Navin");
    m.put(4, "Shubham");
    m.put(5, "SHnatanu");
    m.put(6, "Megha");

    m.forEach((key, value) -> {
      System.out.println(key + "," + value);
    });

    m.remove(6);

    Iterator<Map.Entry<Integer, String>> it = m.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Integer, String> entry = it.next();
      if (entry.getValue() != "Adwyait")
        System.out.println(entry.getKey() + "->" + entry.getValue());
    }
  }
}