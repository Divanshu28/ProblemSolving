package org.example;

import java.util.Arrays;

public class RearrangeSign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int res[] = new int[n];
        int k=0;
        while(i<n && j<n) {
            if(nums[i] > 0 && nums[j] < 0) {
                res[k++] = nums[i];
                res[k++] = nums[j];
                i+=1;
                j+=1;
            }
            if(i>=n || j>=n)
                break;
            if(nums[i]<0) {
                i++;
            }
            if(nums[j] > 0) {
                j++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
