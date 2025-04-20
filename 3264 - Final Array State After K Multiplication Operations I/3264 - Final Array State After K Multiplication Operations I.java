class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // Custom comparator for the priority queue
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]); // Compare by index if values are the same
            }
            return Integer.compare(a[0], b[0]); // Compare by value
        });

        // Push all elements along with their indices into the priority queue 
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[] { nums[i], i });
        }

        // Perform k operations
        while (k-- > 0) {
            int[] smallest = pq.poll(); // Get the smallest element
            smallest[0] *= multiplier; // Multiply the value
            pq.add(smallest); // Add it back to the priority queue
        }

        // Update the original array based on the final state in the priority queue
        while (!pq.isEmpty()) {
            int[] entry = pq.poll();
            nums[entry[1]] = entry[0];
        }

        return nums;
    }
}
