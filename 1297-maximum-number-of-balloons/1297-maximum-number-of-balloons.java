class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for(char c: text.toCharArray())
        {
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }

        String balloon = "balloon";

        Map<Character, Integer> balloonMap = new HashMap<>();
        for(char c: balloon.toCharArray())
        {
            balloonMap.put(c,balloonMap.getOrDefault(c,0)+1);
        }

        int maxBalloons = Integer.MAX_VALUE;

        for(Map.Entry<Character,Integer> e : balloonMap.entrySet())
        {
            char key = e.getKey();
            int count = e.getValue();
            maxBalloons = Math.min(maxBalloons, freqMap.getOrDefault(key,0)/count);
        }
        return maxBalloons;
    }
}