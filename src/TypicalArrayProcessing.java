import java.util.Arrays;
import java.util.List;

public class TypicalArrayProcessing {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(findMax(numbers));
        System.out.println(Arrays.toString(copyArray(numbers)));
        System.out.println(Arrays.toString(reverseArray(numbers)));;



    }

    private static int[] reverseArray(int[] numbers) {
        for(int i = 0; i< numbers.length/2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length-i-1];
            numbers[numbers.length-i-1] = temp;
        }
        return numbers;
    }

    private static int[] copyArray(int[] numbers) {
        int N = numbers.length;
        int[] copyArray = new int[N];
        for (int i = 0; i < N; i++) {
            copyArray[i] = numbers[i];
        }
        return copyArray;
    }

    private static int findMax(int[] numbersForMax) {
        int max = numbersForMax[0];
        for (int i = 0; i < numbersForMax.length; i++) {
            if (numbersForMax[i] > max) max = numbersForMax[i];
        }
        return max;
    }


}
