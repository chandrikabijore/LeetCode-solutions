class ProductOfNumbers {
    private int index;
    private final List<List<Integer>> numbers;

    public ProductOfNumbers() {
        index = 0;
        numbers = new ArrayList<>();
        for (int i = 0; i <= 100; ++i) {
            numbers.add(new ArrayList<>());
        }
    }
    
    public void add(int num) {
        numbers.get(num).add(index++);
    }
    
    public int getProduct(int k) {
        int beginIndex = index - k;
        int product = 1;
        for (int i = 0; i <= 100; ++i) {
            if (i == 1) continue;
            int count = getCount(numbers.get(i), beginIndex);
            if (count > 0) {
                if (i == 0) return 0;
                product *= (int) Math.pow(i, count);
            }
        }

        return product;
    }

    private int getCount(List<Integer> arr, int index) {
        if (arr.isEmpty() || arr.get(arr.size() - 1) < index) 
            return 0;
        
        int left = 0, right = arr.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            int value = arr.get(mid);
            if (value < index) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return arr.size() - left;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
