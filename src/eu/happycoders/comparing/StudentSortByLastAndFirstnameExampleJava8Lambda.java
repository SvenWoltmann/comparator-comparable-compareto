package eu.happycoders.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortByLastAndFirstnameExampleJava8Lambda {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(47271, "Kerrie", "Adkins"));
    students.add(new Student(25618, "Dina", "Mckay"));
    students.add(new Student(99319, "Aarron", "Wicks"));
    students.add(new Student(68804, "Cooper", "Mckay"));
    students.add(new Student(11056, "Kaya", "Molina"));

    students.sort((o1, o2) -> {
      int result = o1.getLastName().compareTo(o2.getLastName());
      if (result == 0) {
        result = o1.getFirstName().compareTo(o2.getFirstName());
      }
      return result;
    });

    System.out.println("students = " + students);
  }
}
