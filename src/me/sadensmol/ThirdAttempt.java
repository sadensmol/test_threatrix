package me.sadensmol;

import java.util.HashSet;
import java.util.Set;

public class ThirdAttempt implements ISolution {
    public int solve(int[] A) {
        var length = A.length;

        //1st iteration through the array
        //go through all elements and place them to the proper place
        // 1 should go to 1st place (index 0),.... 10 should go to the 10th place.
        for (int i = 0; i < length; i++) {
            //target index for the value
            //if value is 1 it should be placed on the 1st position of array
            int index = A[i] - 1;
            //skip negatives and elements already in place
            //and move elements to their position
            while ((index+1) > 0 && (index+1) < length  && (index+1) != A[index]){
                int temp = A[i];
                A[i] = A[index];
                A[index] = temp;
            }
        }

        //go through elements and find first on the wrong place
        for (int i = 0; i < length; i++) {
            int index = A[i] - 1; //correct index for the element
            if (index != i)
                return i + 1;
        }
        return length + 1;
    }


}

