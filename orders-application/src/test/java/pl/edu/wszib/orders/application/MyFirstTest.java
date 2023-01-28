package pl.edu.wszib.orders.application;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyFirstTest {

    @Test
    public void should_be_able_to_find_existing_order() {
        assertTrue(true);
    }

    @Test
    public void should_sum_values() {
        int result = sum(1, 2, 3, 4, 5);
        assertEquals(12, result);
    }

    public static Integer sum(int... integers) {
        return IntStream.of(integers).sum();
    }


}
