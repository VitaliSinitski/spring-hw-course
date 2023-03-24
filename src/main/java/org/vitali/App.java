package org.vitali;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

        Course allStudents = context.getBean("allStudents", Course.class);
        System.out.println("All students of Main course:");
        allStudents.getAllStudents();

        System.out.println("--------");
        Course courseCompLess5 = context.getBean("courseCompLess5", Course.class);
        System.out.println("Students, average mark more than 5:");
        courseCompLess5.getStudentsCondition().forEach(System.out::println);

        System.out.println("--------");
        Course courseComp5 = context.getBean("courseComp5", Course.class);
        System.out.println("Students, average mark less than 5:");
        courseComp5.getStudentsCondition().forEach(System.out::println);

        System.out.println("--------");
        Course courseMax = context.getBean("courseMax", Course.class);
        System.out.println("Student, average mark is maximum:");
        courseMax.getStudentsCondition().forEach(System.out::println);

        System.out.println("--------");
        Course courseMin = context.getBean("courseMin", Course.class);
        System.out.println("Student, average mark is minimum:");
        courseMin.getStudentsCondition().forEach(System.out::println);
    }
}
