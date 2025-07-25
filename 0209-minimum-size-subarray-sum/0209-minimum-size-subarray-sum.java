class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int start = 0,sum=0;

        for(int end=0;end<nums.length;end++)
        {
            sum = sum+nums[end];

            while(sum>=target)
            {
                minLength = Math.min(minLength,end-start+1);
                sum = sum-nums[start++];
            }
        }
        return (minLength==Integer.MAX_VALUE)?0:minLength;
    }
}