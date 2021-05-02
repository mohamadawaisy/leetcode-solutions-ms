class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String frequentWord=null;
        int frequency=0;
        
        HashMap<String,Integer> frequentWords = new HashMap<String,Integer>();
        
        HashSet bannedSet = createBannedSet(banned);
        
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        
        for(String word:words)
        {
            
            if(!bannedSet.contains(word))
            {
                int count = frequentWords.containsKey(word)? frequentWords.get(word)+1:1;
                frequentWords.put(word,count);
                
                if(count>frequency)
                {
                    frequency=count;
                    frequentWord=word;
                }
            }
        }
        
        return frequentWord;
    }
    
    private HashSet createBannedSet(String[] banned)
    {
        HashSet<String> bannedSet = new HashSet<String>();
        
        for(String bannedWord : banned)
        {
            bannedSet.add(bannedWord);
        }
        
        return bannedSet;
    }
}
