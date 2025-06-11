class Solution {
    public void moveZeroes(int[] nums) {
        int insertPosition = 0;

        for(int current = 0;current<nums.length;current++)
            {
                if(nums[current]!=0)
                {
                    nums[insertPosition] = nums[current];
                    insertPosition++;
                }
            }

        while(insertPosition<nums.length)
            {
                nums[insertPosition++] = 0;
            }
    }
}