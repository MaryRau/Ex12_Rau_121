import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test5 {

    @Test
    void maxElem() {
        int[] numbers = { 0, 0, 0};
        int actual = Main.maxElem(numbers);
        int expected = 0;
        assertEquals(expected, actual);
    }
}