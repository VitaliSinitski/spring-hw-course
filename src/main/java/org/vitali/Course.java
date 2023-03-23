package org.vitali;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Course {
    private String name;
    private List<Student> students = new ArrayList<>();
    private List<Student> studentsCondition = new ArrayList<>();
    public void getAllStudents() {
        for(Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
    }
    @Override
    public String toString() {
        return "Course{" +
               "name='" + name + '\'' +
               '}';
    }
}
