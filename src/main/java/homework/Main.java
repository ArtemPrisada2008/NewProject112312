package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println("Початковий список: " + integerList);
        ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            int currentValue = listIterator.next();
            listIterator.set(currentValue + 1);
        }

        System.out.println("Список після збільшення на 1: " + integerList);
    }
}

