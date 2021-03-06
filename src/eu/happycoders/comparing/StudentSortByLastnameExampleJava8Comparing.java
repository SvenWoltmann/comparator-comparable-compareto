package eu.happycoders.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortByLastnameExampleJava8Comparing {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(47271, "Kerrie", "Adkins"));
    students.add(new Student(99319, "Aarron", "Wicks"));
    students.add(new Student(11056, "Kaya", "Molina"));

    students.sort(Comparator.comparing(Student::getLastName));

    System.out.println("students = " + students);
  }
}
