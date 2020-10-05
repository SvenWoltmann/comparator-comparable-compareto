package eu.happycoders.comparing;

import java.util.Arrays;

public class NameSortExample {
  public static void main(String[] args) {
    String[] names = {"Mary", "James", "Patricia", "John", "Jennifer", "Robert"};
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
  }
}
