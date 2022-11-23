package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RomanToInteger {
    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    //function to convert roman to integer
    static int convertRomanToInt(String s) {


        int result = value(s.charAt(s.length() - 1));

        int i = s.length() - 1;
        List<Integer> resultList = new ArrayList<>();
        while (i > -1) {

            if (i == 0) {
                resultList.add(value(s.charAt(i)));
                break;
            }
            if (value(s.charAt(i - 1)) >= value(s.charAt(i))) {
                result += value(s.charAt(i - 1));
                resultList.add(value(s.charAt(i)));

            } else {
                result -= value(s.charAt(i - 1));
                resultList.add(value(s.charAt(i)) - value(s.charAt(i - 1)));
                i--;
            }
            i--;
        }

        System.out.println(resultList);

/*        for (int i = s.length() - 1; i > 0; i--) {


            if (value(s.charAt(i - 1)) >= value(s.charAt(i))) {
                result += value(s.charAt(i - 1));
                resultList.add(value(s.charAt(i)));
            } else {
                result -= value(s.charAt(i - 1));
                resultList.add(value(s.charAt(i)) - value(s.charAt(i - 1)));
            }
        }*/

        if (!resultList.stream().sorted().toList().equals(resultList)) {
            return -1;
        }


        return resultList.stream().mapToInt(a -> a).sum();
    }

    public static void main(String[] args) {
        System.out.println(convertRomanToInt("D"));
    }
}
