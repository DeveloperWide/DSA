package Heaps;

import java.util.ArrayList;

public class Heaps {
  public static class Heap {
    ArrayList<Integer> heap = new ArrayList<>();

    void insert(int data) {
      heap.add(data);

      int childIdx = heap.size() - 1;
      int parentIdx = (childIdx - 1) / 2;

      while (childIdx > 0 &&
          heap.get(parentIdx) > heap.get(childIdx)) {

        int temp = heap.get(childIdx);
        heap.set(childIdx, heap.get(parentIdx));
        heap.set(parentIdx, temp);

        // Move upward
        childIdx = parentIdx;
        parentIdx = (childIdx - 1) / 2;
      }
    }

    int peek() {
      return heap.get(0);
    }

    private void heapify(int i) {
      int leChildIdx = 2 * i + 1;
      int riChildIdx = 2 * i + 2;
      int minIdx = i;

      if (leChildIdx < heap.size() && heap.get(minIdx) > heap.get(leChildIdx)) {
        minIdx = leChildIdx;
      }

      if (riChildIdx < heap.size() && heap.get(minIdx) > heap.get(riChildIdx)) {
        minIdx = riChildIdx;
      }

      if (minIdx != i) {
        int temp = heap.get(i);
        heap.set(i, heap.get(minIdx));
        heap.set(minIdx, temp);

        heapify(minIdx);
      }
    }

    int remove() {
      int data = heap.get(0);
      // Swap
      int temp = heap.get(0);
      heap.set(0, heap.get(heap.size() - 1));
      heap.set(heap.size() - 1, temp);

      heap.remove(heap.size() - 1);

      heapify(0);
      return data;
    }

    boolean isEmpty() {
      return heap.size() == 0;
    }
  }

  public static void main(String[] args) {
    Heap pq = new Heap();

    pq.insert(9);
    pq.insert(6);
    pq.insert(10);
    pq.insert(5);

    while (!pq.isEmpty()) {
      System.out.print(pq.peek() + ", ");
      pq.remove();
    }

    System.out.println();
  }
}
