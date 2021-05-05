package service;

import model.Student;

public class StudentService {

    public static void printFullNames(Student[] students) {
        for (Student student : students) {
            System.out.printf("%s %s\n",student.getFirstName(),student.getLastName());
        }
    }

    public static void printMaleStudents(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'm') {
                System.out.println(student);
            }
        }
    }

    public static void femaleStudentsMarkGreater50Dot4(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'f' && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
    }

    public static void printStudentWithMinMark (Student[] students) {
        Student min = students[0];
        for (int i = 1; i < students.length ; i++) {
            if (students[i].getMark() < min.getMark()) min = students[i];
        }
        System.out.println(min);
    }

    public static void printBiggestMaleStudent (Student[] students) {
        Student max = null;
        for (Student student : students) {
            if (student.getGender() == 'm') {
                if (max == null) max = student;
                else if(student.getYear() < max.getYear()) max = student;
            }
        }
        if(max != null) {
            System.out.println(max);
        }
    }

    public static void printSortedByMark(Student[] students) {
        boolean isActive = true;
        int countOfFors = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < students.length - 1 - countOfFors; i++) {
                if (students[i].getMark() > students[i + 1].getMark()) {
                    Student x = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = x;
                    isActive = true;
                }
            }
            countOfFors++;
        }

        for(Student student : students){
            System.out.println(student);
        }
    }

    public static void FemaleStudentsSortedByYear(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if(student.getGender() == 'f') ++count;
        }

        if (count != 0) {
            Student[] femaleStudents = new Student[count];
            int position = 0;
            for (Student student : students) {
                if(student.getGender() == 'f') {
                    femaleStudents[position++] = student;
                }
            }

            boolean isActive = true;
            int countOfFors = 0;
            while (isActive) {
                isActive = false;
                for (int i = 0; i < count - 1 - countOfFors; i++) {
                    if (femaleStudents[i].getYear() > femaleStudents[i + 1].getYear()) {
                        Student x = femaleStudents[i];
                        femaleStudents[i] = femaleStudents[i + 1];
                        femaleStudents[i + 1] = x;
                        isActive = true;
                    }
                }
                countOfFors++;
            }

            for (Student student : femaleStudents) {
                System.out.println(student);
            }
        }

    }
}
