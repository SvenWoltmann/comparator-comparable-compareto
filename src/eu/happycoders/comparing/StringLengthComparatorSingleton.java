package eu.happycoders.comparing;

import java.util.Comparator;

public class StringLengthComparatorSingleton implements Comparator<String> {
  public static final StringLengthComparatorSingleton INSTANCE =
      new StringLengthComparatorSingleton();

  private StringLengthComparatorSingleton() {}

  @Override
  public int compare(String o1, String o2) {
    return Integer.compare(o1.length(), o2.length());
  }
}
