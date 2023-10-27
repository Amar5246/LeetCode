class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=201;  
        String prefix="";
        for(String s:strs)
        {
            if(s.length()<min)
            {
                prefix=s; 
                min=s.length();
            }
        }  
        for(int i=0;i<strs.length;i++)
        {
            if(strs[i].indexOf(prefix)!=0)
            {
                prefix= prefix.substring(0, prefix.length() - 1); 
                i--;
            }
        }
        return prefix;
    }
}