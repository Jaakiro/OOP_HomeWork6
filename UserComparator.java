package org.example.hw6;

import java.util.Comparator;

public class UserComparator <T extends User> implements Comparator<T> { // LSP Принцип подстановки Барбары Лисков,
    // каждый пользователь сортируется по фио, класс для всех Юзеров
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
