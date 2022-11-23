package LeetCode;

import java.util.*;
import java.util.stream.IntStream;

public class SingleNumber {

/*    Given a non-empty array of integers nums,
      every element appears twice except for one.
      Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.

        Example 1:
        Input: nums = [2,2,1]
        Output: 1

        Example 2:
        Input: nums = [4,1,2,1,2]
        Output: 4

        Example 3:
        Input: nums = [1]
        Output: 1


    Constraints:
            1 <= nums.length <= 3 * 104
            -3 * 104 <= nums[i] <= 3 * 104
    Each element in the array appears twice except for one element which appears only once.*/

    public static void main(String[] args) {
        int[] nums = { 1,2,1,2,4};
        //System.out.println(singleNumber(nums));
        System.out.println(singleNumber(nums));

    }

    private static int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result = result ^ i;
            ///a^a=0
            //a^0=a
        }
        //neticede:
        // result = 4 ^ 1 ^ 2 ^ 1 ^ 2
        // result = 4 ^ 0 -> 4
        return result;
    }

    /**
     * KÖTÜ ÇÖZÜM!
     */
    private static int findSingleNumber(int[] nums) {
        int sum = 0;
        Set<Integer> numsSet = new HashSet<>();
        Arrays.stream(nums).forEach(numsSet::add);
        return 2 * numsSet.stream().mapToInt(value -> value).sum() - Arrays.stream(nums).sum();
    }

    private static int findSingleNumber3(int[] nums) {

        Map<Integer, Boolean> map = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])){
                map.replace(nums[i], true);
            }
            else map.put(nums[i], false);
        }

        return map.entrySet().stream().filter(integerBooleanEntry -> !integerBooleanEntry.getValue()).findFirst().get().getKey();

    }


}
