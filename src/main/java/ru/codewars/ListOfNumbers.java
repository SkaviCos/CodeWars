package ru.codewars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListOfNumbers {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                i--;
            }
        }
        return listOfNumbers;
    }
}