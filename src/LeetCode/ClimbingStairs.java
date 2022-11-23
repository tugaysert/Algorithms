package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    /*    You are climbing a staircase. It takes n steps to reach the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

        Example 1:
        Input: n = 2
        Output: 2
        Explanation: There are two ways to climb to the top.
            1. 1 step + 1 step
            2. 2 steps

        Example 2:
        Input: n = 3
        Output: 3
        Explanation: There are three ways to climb to the top.

            1. 1 step + 1 step + 1 step
            2. 1 step + 2 steps
            3. 2 steps + 1 step


        Constraints:

                1 <= n <= 45*/
    public static void main(String[] args) {
        //f(n) = f(n-1) + f(n-2)
        //f(2) = 2
        //f(3) = 3


        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 3);
        System.out.println(recursiveClimb(hashMap, 8));

    }

    public static int recursiveClimb(Map<Integer, Integer> hashMap, int step) {

        if (hashMap.containsKey(step)) return hashMap.get(step);

        hashMap.put(step, recursiveClimb(hashMap, step - 1) + recursiveClimb(hashMap, step - 2));
        return hashMap.get(step);

    }


    public static int climbStairs2(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 2;
        int b = 1;
        int c = 0;

        for (int i = 3; i < n + 1; i++) {

            c = a + b;
            b = a;
            a = c;

        }

        return c;

    }

}