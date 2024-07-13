package net.meawmere.ExtraUtils.python;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class python {

    /**
     * This method allows you to go through the list of numbers and get the element by index in the iteration you need.
     * Usage example {@code for (int i : python.range(1) ) {
     *     someList.get(0);
     * }}
     */
    @NotNull
    public static List<Integer> range(int stop)  {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < stop; i++) integerList.add(i);
        return integerList;
    }

    @NotNull
    public static List<Integer> range(int start, int stop)  {
        List<Integer> integerList = new ArrayList<>();
        for (int i = start; i < stop; i++) integerList.add(i);
        return integerList;
    }

    @NotNull
    public static List<Integer> range(int start, int stop, int step)  {
        List<Integer> integerList = new ArrayList<>();
        int count = 0;
        for (int i = start; i < stop; i++) {
            if (count == step) {
                count = 0;
                integerList.add(i);
            }
            count++;
        };
        return integerList;
    }
}
