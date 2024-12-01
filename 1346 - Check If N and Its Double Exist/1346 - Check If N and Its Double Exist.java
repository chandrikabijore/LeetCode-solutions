class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>(); // HashMap to store elements

        for (int num : arr) { // Iterate over the array
            // Check if 2 * num or num / 2 exists in the map
            if (map.containsKey(2 * num) || (num % 2 == 0 && map.containsKey(num / 2))) {
                return true; // Return true if the condition is met
            }
            // Add the current number to the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return false; // Return false if no such pair exists
    }
}
