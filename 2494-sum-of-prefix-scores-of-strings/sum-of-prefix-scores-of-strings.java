class Solution {
    public int[] sumPrefixScores(String[] words) {
        
        Tries trie=new Tries(); 
        for(String word:words){
            
            add(word,trie);
        }
        
        int[] res=new int[words.length];
        
        
        for(int i=0;i<words.length;i++){
            
            Tries temp=trie;
            res[i]=count(temp,words[i],0);
        }
        return res;
    }
    
    public int count(Tries temp,String word,int in){
        
        
        if(in==word.length()) return 0;
        char ch=word.charAt(in);
        
        int ans=0;
        if(temp.map.containsKey(ch)){
          ans+=temp.map.get(ch).count+count(temp.map.get(ch),word,in+1);  
            
        }
        return ans;
    }
    
    public void add(String str,Tries trie){
        
        Tries temp=trie;
        for(int i=0;i<str.length();i++){
            
            char ch=str.charAt(i);
            
            if(!temp.map.containsKey(ch)){
                temp.map.put(ch,new Tries());
            }
            
            
            temp=temp.map.get(ch);
            temp.count+=1;
        }
    }
    public class Tries{
        HashMap<Character,Tries> map=new HashMap<>();
        int count=0;
    }
}