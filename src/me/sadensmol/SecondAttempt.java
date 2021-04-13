package me.sadensmol;

import java.util.HashSet;
import java.util.Set;

public class SecondAttempt implements ISolution {
    public int solve(int[] A) {
        // unique positive elements
        Set<Integer> set = new HashSet<>();


        //iterate over all values
        for (int val : A) {
            //if it's positive add to set for the further check
            if (val > 0) {
                set.add(val);
            }
        }

        //the first positive
        int s = 1;

        //check every element in increasing
        while (set.contains(s)) {
            s++;
        }

        return s;
    }

}

