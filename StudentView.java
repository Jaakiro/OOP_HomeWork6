package org.example.hw6;

import java.util.List;

public class StudentView implements UserView<Student> { // Принцип инверсии зависимостей
    @Override
    public void sendOnConsole(List<Student> list) { // Принцип подстановки Барбары Лисков
        for (Student student : list) {
            System.out.println("student = " + student);
        }
    }
}
