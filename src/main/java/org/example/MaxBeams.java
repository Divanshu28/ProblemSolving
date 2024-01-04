package org.example;

import java.util.ArrayList;
import java.util.List;

public class MaxBeams {
    public static int numberOfBeams(String[] bank) {

        int ans = 0;
        int prev = 0;

        for(String s : bank) {
            int total=0;
            int i=0;
            while(i<s.length()) {
                total += Character.getNumericValue(s.charAt(i));
                i+=1;
            }
            if(total >0) {
                ans += prev * total;
                prev = total;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] str = { "011001","000000","010100","001000"};

        System.out.println(numberOfBeams(str));
    }


}
