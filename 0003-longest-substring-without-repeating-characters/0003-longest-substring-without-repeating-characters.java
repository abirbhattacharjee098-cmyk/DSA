class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int low=0;
        int res=0;
        int k=0;
        Map<Character, Integer>f=new HashMap<>();
        for(int high=0; high<n; high++){
            char ch=s.charAt(high);
            f.put(ch,f.getOrDefault(ch,0)+1);
            k=(high-low)+1;
            while(f.size()<k){
                char ch1=s.charAt(low);
                f.put(ch1, f.get(ch1)-1);
                if(f.get(ch1)==0)
                f.remove(ch1);
                low++;
                k=(high-low)+1;
            }
            int len=(high-low)+1;
            res=Math.max(res,len);
        }
        return res;
    }
}