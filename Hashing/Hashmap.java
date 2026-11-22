package Hashing;

import java.util.*;

public class Hashmap {
  public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    Set<String> keys = map.keySet();
    map.put("US", 50);
    map.put("Japan", 30);
    map.put("China", 60);

    System.out.println(map);

    System.out.println(keys);

    for (String key : keys) {
      System.out.println(key + " = " + map.get(key));
    }
  }
}
