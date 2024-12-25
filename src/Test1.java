import static org.junit.jupiter.api.Assertions.*;

class Test1 {

    @org.junit.jupiter.api.Test
    void maxElem() {
        int[] numbers = { 1, 2, 3};
        int actual = Main.maxElem(numbers);
        int expected = 3;
        assertEquals(expected, actual);
    }
}