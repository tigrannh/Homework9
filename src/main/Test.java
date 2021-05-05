package main;

import model.Student;
import service.FileService;
import service.StudentService;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        String[] read = new String[0];
        try {
            read = FileService.read("C:\\users\\Tigran_Hakobyan\\students.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Student[] students = new Student[read.length];
        for (int i = 0; i < read.length; i++) {
            students[i] = new Student(read[i]);
        }

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("Print full names of students");
        StudentService.printFullNames(students);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Print all male students");
        StudentService.printMaleStudents(students);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Print all female students who has mark greater then 50.4");
        StudentService.femaleStudentsMarkGreater50Dot4(students);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Print student information having the minimal mark");
        StudentService.printStudentWithMinMark(students);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Print biggest male student information");
        StudentService.printBiggestMaleStudent(students);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Print students sorted by mark");
        StudentService.printSortedByMark(students);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Print female students sorted by year");
        StudentService.FemaleStudentsSortedByYear(students);
        System.out.println("----------------------------------------------------------------");

    }
}
