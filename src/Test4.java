import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4 {

    @Test
    void maxElem() {
        int[] numbers = { 10, -2, 55};
        int actual = Main.maxElem(numbers);
        int expected = 55;
        assertEquals(expected, actual);
    }
}