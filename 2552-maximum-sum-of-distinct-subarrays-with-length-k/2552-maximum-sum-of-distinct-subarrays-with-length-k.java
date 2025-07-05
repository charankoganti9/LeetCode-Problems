import java.util.HashSet;

public class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (k > n) return 0; // Edge case fix: not enough elements

        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        long sum = 0, maxSum = 0;

        while (right < n) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];
            right++;

            if (right - left == k) {
                maxSum = Math.max(maxSum, sum);
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}
