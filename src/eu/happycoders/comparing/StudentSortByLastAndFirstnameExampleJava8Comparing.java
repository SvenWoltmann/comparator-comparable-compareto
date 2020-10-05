package eu.happycoders.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortByLastAndFirstnameExampleJava8Comparing {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(47271, "Kerrie", "Adkins"));
    students.add(new Student(25618, "Dina", "Mckay"));
    students.add(new Student(99319, "Aarron", "Wicks"));
    students.add(new Student(68804, "Cooper", "Mckay"));
    students.add(new Student(11056, "Kaya", "Molina"));

    students.sort(Comparator.comparing(Student::getLastName)
            .thenComparing(Student::getFirstName));

    System.out.println("students = " + students);
  }
}
