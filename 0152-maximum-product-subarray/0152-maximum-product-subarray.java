class Solution {
    public int maxProduct(int[] nums) {
    // Edge case: if the array is empty
    if (nums == null || nums.length == 0) {
        return 0;
    }
    
    // Initialize the maximum and minimum product so far with the first element
    int maxProductSoFar = nums[0];
    int minProductSoFar = nums[0];
    // Result variable to store the final answer
    int maxProductResult = nums[0];
    
    // Iterate over the rest of the array from the second element
    for (int i = 1; i < nums.length; i++) {
        int currentNum = nums[i];
        // Temporarily store the maxProductSoFar for swapping if needed
        int tempMax = maxProductSoFar;
        
        // Update maxProductSoFar based on the current number and compared products
        maxProductSoFar = Math.max(currentNum, Math.max(maxProductSoFar * currentNum, minProductSoFar * currentNum));
        
        // Update minProductSoFar similarly to handle mixed signs
        minProductSoFar = Math.min(currentNum, Math.min(tempMax * currentNum, minProductSoFar * currentNum));
        
        // Update the result with the maximum of potentially new maxProductSoFar
        maxProductResult = Math.max(maxProductResult, maxProductSoFar);
    }
    return maxProductResult;
}
}