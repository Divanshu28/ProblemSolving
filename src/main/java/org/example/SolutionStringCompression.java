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

class SolutionStringCompression {
    public static int compress(char[] chars) {


        int n = chars.length;
        if(n==1)
            return 1;

        int i = 0;
        int j = i + 1;

        int count = 1;

        StringBuilder sb = new StringBuilder();
        while(j < n) {

            if(chars[i] == chars[j]) {
                j++;
                count++;
            } else {
                sb.append(chars[i]);
                if(count > 1) {
                    String intString = Integer.toString(count);

                    for (int k = 0; k < intString.length(); k++) {
                        sb.append(intString.charAt(k)) ;
                    }
                    count = 1;
                }

                i = j;
                j = i+1;

            }

        }

        sb.append(chars[i]);
        if(count > 1) {
            String intString = Integer.toString(count);

            for (int k = 0; k < intString.length(); k++) {
                sb.append(intString.charAt(k));
            }
        }



        String res = sb.toString();

        for(Character c : res.toCharArray()) {
            System.out.println(c);
        }
        return res.length();
    }



    public static void main(String[] args) {
        ArrayList<char[]> strings = new ArrayList<char[]>();
        char[] chars1 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        char[] chars2 = {'a', 'a', 'b', 'b', 'c', 'c'};
        char[] chars3 = {'a', 'b'};
        strings.add(chars1);
        strings.add(chars2);
        strings.add(chars3);

        for (char[] ch : strings) {
            System.out.println(SolutionStringCompression.compress(ch));
        }

    }
}
