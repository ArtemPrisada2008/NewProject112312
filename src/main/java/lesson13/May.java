package lesson13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class May {
    public static void main(String[] args) {
        int arr[] = new int[1];
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

        int arr2[] = new int[]{-3, 5, 8, -9, 4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int arr3[] = new int[]{-3, 5, 8, -9, 4};
        Arrays.sort(arr3);
        System.out.println(Arrays.equals(arr2, arr3));
    }
}

class Main14 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(66);
        System.out.println(arrayList);
    }
}