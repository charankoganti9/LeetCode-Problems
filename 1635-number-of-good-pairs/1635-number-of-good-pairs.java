class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> goodPair = new HashMap<>();
        int count = 0;

        for(int num:nums)
        {
            if(goodPair.containsKey(num))
            {
                count += goodPair.get(num);
                goodPair.put(num,goodPair.get(num)+1);
            }
            else
            {
                goodPair.put(num,1);            }
        }
        return count;
    }
}