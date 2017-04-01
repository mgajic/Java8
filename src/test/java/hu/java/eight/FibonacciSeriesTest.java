package hu.java.eight;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertTrue;

public final class FibonacciSeriesTest {
    private final FibonacciSeries underTest;

    public FibonacciSeriesTest() {
        this.underTest = new FibonacciSeries();
    }

    @Test
    public void shouldGenerateFirstTenFibonacciNumbers() {
        final List<Integer> expectedResult = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);

        final List<Integer> actualResult = underTest.generateFirstTenFibonacciNumbers();

        assertTrue(actualResult.equals(expectedResult));
    }
}
