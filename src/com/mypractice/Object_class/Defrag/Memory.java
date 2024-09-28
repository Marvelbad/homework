package com.mypractice.Object_class.Defrag;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Memory {
    public static void executeDefragmentation(String[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[index] = array[i];
                if (index != i) {
                    array[i] = null;
                }
                index++;
            }
        }
    }


    public static void main(String[] args) {
        String[] memory = {"Class-1", null, null, "Object-2", null, null, null, "Object-3", null, "Object-4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
}
