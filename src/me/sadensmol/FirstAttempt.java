package me.sadensmol;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstAttempt {
    static class Solution {
        public int solution(int[] A) {

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
                int diff = set[pos ] - s;
                if (diff > 1) {
                    System.out.println("return s+1 2");
                    return s + 1;
                }
                //assign pos to the current value
                s = set[pos];

                //additional check in case of odd number of elements
                if (pos+1==set.length) {
                    System.out.println("return s+1");
                    return set[pos] +1;
                }
                pos++;
            }

            //if all are negatives
            return 1;
        }

    }


    @Test
    public void case1ShouldReturn5() {
        assertEquals(5, new Solution().solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void case2ShouldReturn4() {
        assertEquals(4, new Solution().solution(new int[]{1, 2, 3}));
    }

    @Test
    public void case3ShouldReturn1() {
        assertEquals(1, new Solution().solution(new int[]{-1, -3}));
    }

    @Test
    public void caseAllSamePositiveShouldReturn2() {
        assertEquals(2, new Solution().solution(new int[]{1, 1, 1}));
    }

    @Test
    public void caseAllSameNegativeShouldReturn1() {
        assertEquals(1, new Solution().solution(new int[]{-1, -1, -1}));
    }

    @Test
    public void caseSinglePositiveShouldReturn3() {
        assertEquals(3, new Solution().solution(new int[]{1, 2}));
    }

    @Test
    public void caseAllSingleNegativeShouldReturn1() {
        assertEquals(1, new Solution().solution(new int[]{-1}));
    }

    @Test
    public void caseWithZeroShouldReturn1() {
        assertEquals(1, new Solution().solution(new int[]{-3, -1, 0, 2, 4}));
    }

    @Test
    public void caseZeroIsTheLastReturn1() {
        assertEquals(1, new Solution().solution(new int[]{-3, -1, 0, 2, 4}));
    }

    @Test
    public void otherPossibleCases() {
        assertEquals(1, new Solution().solution(new int[]{-1, 2, 3}));
        assertEquals(2, new Solution().solution(new int[]{-1, 1, 3}));
        assertEquals(2, new Solution().solution(new int[]{-1, 1, 3}));
    }


}
