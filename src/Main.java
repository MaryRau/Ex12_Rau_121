public class Main {
    public static void main(String[] args) {
    }

    // метод нахождения максимального элемента
    public static int maxElem(int[] numbers){
        int max = 0;
        for (int num: numbers){
            if (num > max)
                max = num;
        }

        return max;
    }
}