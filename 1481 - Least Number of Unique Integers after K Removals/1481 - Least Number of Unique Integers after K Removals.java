import java.util.*;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.naturalOrder());
        minHeap.addAll(freq.values());

        while (k > 0) {
            int top = minHeap.poll();
            if (k >= top) {
                k -= top;
            } else {
                minHeap.offer(top - k);
                k = 0;
            }
        }

        return minHeap.size();
    }

}



