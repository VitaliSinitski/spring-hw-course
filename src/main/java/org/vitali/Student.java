package org.vitali;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private String surname;
    private Course course;
    private Integer averageMark;
    private List<Subject> subjects = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public Student getMaxMarkStudent() {
        return students.stream()
                .max(Comparator.comparingInt(Student::getAverageMark))
                .get();
    }

    public Student getMinMarkStudent() {
        return students.stream()
                .min(Comparator.comparingInt(Student::getAverageMark))
                .get();
    }
    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", course=" + course +
               ", averageMark=" + averageMark +
               ", subjects=" + subjects +
               '}';
    }
}
