class Solution {
    public int characterReplacement(String s, int k) {
       int[] count = new int[26];
       int maxLength =0, maxCount =0, left =0;

       for(int right=0;right<s.length();right++)
       {
        maxCount = Math.max(maxCount,++count[s.charAt(right)-'A']);

        while(right-left+1-maxCount>k)
        {
            count[s.charAt(left)-'A']--;
            left++;
        }
        maxLength = Math.max(maxLength,right-left+1);
       } 
       return maxLength;
    }
}