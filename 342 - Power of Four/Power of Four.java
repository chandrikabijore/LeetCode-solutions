class Solution {
    public boolean isPowerOfFour(int n) {
    if (n <= 0) {
        return false;
    }
    
    // Check if n is a power of two
    if ((n & (n - 1)) != 0) {
        return false;
    }
    
    // Check if the single '1' bit is at an even position
    int countZeros = 0;
    while (n > 1) {
        n >>= 1;
        countZeros++;
    }
    
    return (countZeros % 2 == 0);
}

}
