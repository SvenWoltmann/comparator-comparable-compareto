package eu.happycoders.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortExample {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(47271, "Kerrie", "Adkins"));
    students.add(new Student(99319, "Aarron", "Wicks"));
    students.add(new Student(11056, "Kaya", "Molina"));

    Collections.sort(students);

    System.out.println("students = " + students);
  }
}
