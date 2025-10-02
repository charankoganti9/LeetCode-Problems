class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magazineFreq = new HashMap<>();

        for(char c: magazine.toCharArray())
        {
            magazineFreq.put(c,magazineFreq.getOrDefault(c,0)+1);
        }

        for(char c: ransomNote.toCharArray())
        {
            if(!magazineFreq.containsKey(c) || magazineFreq.get(c)==0)
            {
                return false;
            }

            magazineFreq.put(c, magazineFreq.get(c)-1);
        }

        return true;
    }
}