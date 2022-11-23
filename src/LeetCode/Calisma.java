package LeetCode;

import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

public class Calisma {


    public static void main(String[] args) {

        System.out.println(function(10));

    }


    public static int function(int n){

        if(n==3) return 3;
        if(n==2) return 2;
        int a = function(n-2) + function(n-1);
        return a;
    }

}