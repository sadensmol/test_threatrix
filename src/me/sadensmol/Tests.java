package me.sadensmol;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    //        ISolution solution = new FirstAttempt(); //700 ns
//    ISolution solution = new SecondAttempt(); //500 ns
    ISolution solution = new ThirdAttempt(); // 100 ns

    @Test
    public void case1PerformanceTest() {
        var nt = 100000;
        long start = System.nanoTime();
        for (var i = 0; i < nt; i++) {
            solution.solve(new int[]{1, 3, 6, 4, 1, 2});
        }
        System.out.printf("case 1 time: %d\n", (System.nanoTime() - start) / nt);
    }


    @Test
    public void case1ShouldReturn5() {
        assertEquals(5, solution.solve(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void case2ShouldReturn4() {
        assertEquals(4, solution.solve(new int[]{1, 2, 3}));
    }

    @Test
    public void caseBackCombinationShouldReturn4() {
        assertEquals(4, solution.solve(new int[]{3, 2, 1}));
    }

    @Test
    public void case3ShouldReturn1() {
        assertEquals(1, solution.solve(new int[]{-1, -3}));
    }

    @Test
    public void caseAllSamePositiveShouldReturn2() {
        assertEquals(2, solution.solve(new int[]{1, 1, 1}));
    }

    @Test
    public void caseAllSameNegativeShouldReturn1() {
        assertEquals(1, solution.solve(new int[]{-1, -1, -1}));
    }

    @Test
    public void caseSinglePositiveShouldReturn3() {
        assertEquals(3, solution.solve(new int[]{1, 2}));
    }

    @Test
    public void caseAllSingleNegativeShouldReturn1() {
        assertEquals(1, solution.solve(new int[]{-1}));
    }

    @Test
    public void caseWithZeroShouldReturn1() {
        assertEquals(1, solution.solve(new int[]{-3, -1, 0, 2, 4}));
    }

    @Test
    public void caseZeroIsTheLastReturn1() {
        assertEquals(1, solution.solve(new int[]{-3, -1, 2, 4, 0}));
    }

    @Test
    public void caseZeroIsInTheMiddleReturn1() {
        assertEquals(1, solution.solve(new int[]{-3, -1, 0, 4, 2}));
    }


    @Test
    public void otherPossibleCases() {
        assertEquals(1, solution.solve(new int[]{-1, 2, 3}));
        assertEquals(2, solution.solve(new int[]{-1, 1, 3}));
        assertEquals(2, solution.solve(new int[]{-1, 1, 3}));
    }


}
