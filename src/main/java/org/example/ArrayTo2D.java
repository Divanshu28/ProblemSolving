package org.example;

import java.util.*;

public class ArrayTo2D {

    public static List<List<Integer>> findMatrix(int[] nums) {
        int f[] = new int[nums.length + 1];

        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int c : nums) {
            if (f[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            ans.get(f[c]).add(c);
            f[c]++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(ArrayTo2D.findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1}));
    }
}
