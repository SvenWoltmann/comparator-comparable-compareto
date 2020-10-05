package eu.happycoders.comparing;

import java.util.Comparator;

public class StringLengthComparatorParam implements Comparator<String> {
  public static final StringLengthComparatorParam ASC = new StringLengthComparatorParam(true);
  public static final StringLengthComparatorParam DESC = new StringLengthComparatorParam(false);

  private final boolean ascending;

  private StringLengthComparatorParam(boolean ascending) {
    this.ascending = ascending;
  }

  @Override
  public int compare(String o1, String o2) {
    int result = Integer.compare(o1.length(), o2.length());
    return ascending ? result : -result;
  }
}
