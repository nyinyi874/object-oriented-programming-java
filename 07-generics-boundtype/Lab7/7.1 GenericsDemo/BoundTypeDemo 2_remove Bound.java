/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */

class Stats<T> {
    
  T[] nums;

  // Constructor
  Stats(T[] nums) {
    this.nums = nums;
  }

  // Calculate average
  double average() {
    double sum = 0;
    for (T num : nums) {
      sum += num.doubleValue();
    }
    return sum / nums.length;
  }
}


public class BoundTypeDemo {
    public static void main(String[] args) {
    // Use with Integer
    Integer[] intNums = {10, 20, 30, 40};
    Stats<Integer> intStats = new Stats<>(intNums);
    System.out.println("Integer average: " + intStats.average());

    // Use with Double
    Double[] doubleNums = {1.5, 2.5, 3.5};
    Stats<Double> doubleStats = new Stats<>(doubleNums);
    System.out.println("Double average: " + doubleStats.average());
    
    // Use with unrelated type
    String[] strNums = {"10", "20", "30"};
    Stats<String> strStats = new Stats<>(strNums); // Error
    System.out.println("String average: " + strStats.average());

  }
    
}
