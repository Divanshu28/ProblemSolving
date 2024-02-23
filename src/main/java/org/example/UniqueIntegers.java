package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class UniqueIntegers {

    class Key {
        int freq;
        int key;
        Key(int k, int f)
        {
            freq = f;
            key = k;
        }
    }
    class KeyComparator implements Comparator<Key> {

        public int compare(Key k1, Key k2)
        {
            if (k1.freq > k2.freq)
                return 1;
            else if (k1.freq < k2.freq)
                return -1;
            return 0;
        }
    }


        public int findLeastNumOfUniqueInts(int[] arr, int k) {
            HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

            for(int kk : arr) {
                hmap.put(kk, hmap.getOrDefault(kk, 0)+1);
            }

            PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());

            for(Map.Entry<Integer, Integer> e: hmap.entrySet()) {
                pq.add(new Key( e.getKey(), e.getValue()));
            }

            while(k>0) {
                Key curr = pq.peek();
                int c = curr.freq;

                if(k >= c){
                    pq.poll();
                    k-=c;
                } else {
                    k =0;
                }
            }

            return pq.size();
        }

    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        UniqueIntegers uq = new UniqueIntegers();
        System.out.println(uq.findLeastNumOfUniqueInts(arr,3));
    }
}
