class Solution {
    public int maxSubArray(int[] nums)
    {
      int sum = 0;
      int currentSum = nums[0];
      int max_sum = nums[0];

     for(int i=1;i<nums.length;i++)
     {
        currentSum = Math.max(nums[i],currentSum+nums[i]);
        max_sum = Math.max(max_sum,currentSum);
     }
      return max_sum;   
    }
}