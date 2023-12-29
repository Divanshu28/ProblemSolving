package org.example;/*
 * Click `Run` to execute the snippet below!
 */

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class MinCost {

    public static int minCost(String colors, int[] neededTime) {
        int n = colors.length();

        int i = 0;

        int res = 0;

        int j = i+1;

        int maxTime = neededTime[0];

        while(j < n) {
            if(colors.charAt(j) == colors.charAt(j-1)) {
                res += Math.min(maxTime, neededTime[j]);
                maxTime = Math.max(maxTime, neededTime[j]);
            } else {
                maxTime = neededTime[j];
            }
            j+=1;
        }

        return res;
    }


    public static void main(String[] args) {

        String str = "aaabbbabbbb";
        int[] needTime = {3,5,10,7,5,3,5,5,4,8,1};

        System.out.println(MinCost.minCost(str, needTime));
    }
}
