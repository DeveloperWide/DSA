package Hashing;

import java.util.LinkedList;

public class Maps {
  static class HashMap<K, V> {
    private class Node {
      K key;
      V value;
      
      public Node(K key, V value){
        this.key = key;
        this.value = value;
      }
    }

    private int size;
    private LinkedList<Node> buckets[];

    public HashMap(){};

    public void put(K key, V value){

    }

    public boolean containsKey(K key){};
    
  }
}
