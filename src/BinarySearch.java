import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,5,6,7,8};
        binarySearch(4, numbers);
    }

    private static void binarySearch(int aranan, int[] numbers) {

        Arrays.sort(numbers);
        int lo= 0;
        int hi= numbers.length-1;

        while(lo<=hi){
            int mid = (lo + hi) / 2;
            if(aranan <numbers[mid]){
                hi = mid - 1;
            }
            else if(aranan >numbers[mid]) {
                lo = mid + 1;
            }
            else {
                System.out.println("bulundu ve : " +" numbers["+mid+"]");
                return;
            };
        }
        System.out.println("bole bisi yok");
    }
}
