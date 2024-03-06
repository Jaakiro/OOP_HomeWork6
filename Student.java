package org.example.hw6;

public class Student  extends User implements Comparable<Student> { // принцип открытости-закрытости, расширяем
    // студента, поиск по айди, храня фио в юзере
    private Long studentId;


    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (studentId > o.studentId)
            return 1;
        if (studentId < o.studentId)
            return -1;
        return 0;
    }

}
