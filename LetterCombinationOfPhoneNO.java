class Solution { 
    public List<String> letterCombinations(String digits) {
        int n=digits.length(); 
        List<String> ans=new ArrayList<>(); 
        if(n==0)
        {
            return ans; 
        }
        List<String> mapping=new ArrayList<>();  
        mapping.add("");
        mapping.add("");
        mapping.add("abc"); 
        mapping.add("def");
        mapping.add("ghi");
        mapping.add("jkl");
        mapping.add("mno");
        mapping.add("pqrs");
        mapping.add("tuv");
        mapping.add("wxyz"); 
        int index=0; 
        String s="";   
        genrateString( mapping,index,s,ans,digits);
        return ans;
    } 
    public void genrateString( List<String> mapping,int index,String s,List<String> ans,String digits)
    {
        if(index>=digits.length())
        {
            ans.add(s); 
            return ;
        }
        int num=digits.charAt(index)-'0'; 
        String val=mapping.get(num);
        for(int i=0;i<val.length();i++)
        {
            s+=val.charAt(i); 
            genrateString(mapping,index+1,s,ans,digits); 
            s=s.substring(0, s.length() - 1);
        } 
    }
}