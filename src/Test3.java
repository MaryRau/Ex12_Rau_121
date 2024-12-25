import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Test3 {

    @Test
    void maxElem() {
        int[] numbers = { 10, -2, 55};
        int actual = Main.maxElem(numbers);
        int expected = 5;
        assertEquals(expected, actual);
    }
}