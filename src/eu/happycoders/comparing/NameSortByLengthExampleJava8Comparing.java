package eu.happycoders.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class NameSortByLengthExampleJava8Comparing {
  public static void main(String[] args) {
    String[] names = {"Mary", "James", "Patricia", "John", "Jennifer", "Robert"};
    Arrays.sort(names, Comparator.comparing(String::length));
    System.out.println(Arrays.toString(names));
  }
}
