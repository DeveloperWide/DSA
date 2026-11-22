package Heaps;

import java.util.*;

class PriorityQueuePractice {

  static class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
      this.name = name;
      this.marks = marks;
    }

    @Override
    public int compareTo(Student s1) {
      return Integer.compare(s1.marks, this.marks);
    }
  }

  public static void main(String[] args) {
    PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

    pq.add(new Student("Mahesh", 80));
    pq.add(new Student("Aman", 89));
    pq.add(new Student("Rohit", 70));
    pq.add(new Student("Rahul", 90));

    

    System.out.println(pq.size());
    while (!pq.isEmpty()) {
      System.out.println(pq.peek().name + " -> " + pq.peek().marks);
      pq.remove();
    }

  }
}