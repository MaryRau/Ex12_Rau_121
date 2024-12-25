import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2 {

    @Test
    void maxElem() {
        int[] numbers = { 1, 2, 3};
        int actual = Main.maxElem(numbers);
        int expected = 1;
        assertEquals(expected, actual);
    }
}