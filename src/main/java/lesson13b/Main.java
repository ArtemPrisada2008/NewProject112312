package lesson13b;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        // Створення списку цілих чисел
        List<Integer> integerList = new ArrayList<>();

        // Додавання елементів до списку
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        // Виведення початкового списку
        System.out.println("Початковий список: " + integerList);

        // Використання ListIterator для збільшення значень на 1
        ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            int currentValue = listIterator.next();
            listIterator.set(currentValue + 1);
        }

        // Виведення зміненого списку
        System.out.println("Список після збільшення на 1: " + integerList);
    }
}

