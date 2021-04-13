package me.sadensmol;

import java.util.Arrays;

public class FirstAttempt implements ISolution {
    public int solve(int[] A) {

        //corner case improvements
        if (A.length == 1) {
            int s = A[0];
            if (s >= 1)
                return s + 1;
            else return 1;
        }

        int[] set = Arrays.stream(A).sorted().toArray();
        int pos = 0;

        //skip all negative values
        while (pos < set.length && set[pos] < 1) pos++;
        int s = 0; //store the previous value

        while (pos < set.length) {
            //find the difference between current and previous
            int diff = set[pos] - s;
            if (diff > 1) {
                return s + 1;
            }
            //assign pos to the current value
            s = set[pos];

            //additional check in case of odd number of elements
            if (pos + 1 == set.length) {
                return set[pos] + 1;
            }
            pos++;
        }

        //if all are negatives
        return 1;
    }

}

