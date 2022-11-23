package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    /*
        Given an array nums of n integers where nums[i] is in the range [1, n],
        return an array of all the integers in the range [1, n] that do not appear in nums.

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]

        Example 2:
        Input: nums = [1,1]
        Output: [2]

        Constraints:
        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n

        Follow up: Could you do it without extra space and in O(n) runtime?
        You may assume the returned list does not count as extra space
    */
    public static void main(String[] args) {
        List<Integer> nums2 = Arrays.asList(4,3,2,7,8,2,3,1);
        int[] nums = {4,3,2,7,8,2,3,1};
        //array'i manipüle etmeden haberleşmemin yöntemi var olan indexleri -'yle çarpmak.
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearNumber2(nums2));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index]>0) {
                nums[index] = nums[index] * -1;
            }
        }

       for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }

    private static List<Integer> findDisappearNumber2(List<Integer> nums) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            //olası listede 4'denk gelen indexi bul -> 3
            //indexteki değeri (-) ile çarp.
            int index = Math.abs(nums.get(i)) -1;
            if(nums.get(index)>0) nums.set(index, nums.get(index) * -1);

        }

        nums.stream().filter(i -> i>0).forEach(j -> result.add(nums.indexOf(j)+1));

        return result;
    }

}
