package from.ant;

public class MianShi_1601_Best {
    public int[] swapNumbers(int[] numbers) {
        numbers[0]^=numbers[1];
        numbers[1]^=numbers[0];
        numbers[0]^=numbers[1];
        return numbers;
    }
}
