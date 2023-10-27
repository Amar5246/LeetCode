class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck=new Stack<>(); 
        if(s.charAt(0)==')'||s.charAt(0)==']'||s.charAt(0)=='}') return false; 
        char[] a=s.toCharArray();
        for(char ch:a)
        {
            if(ch=='('||ch=='{'||ch=='[')
            {
            	stck.push(ch); 
            } 
            else 
            {
                if(stck.empty())
                {
                    return false;
                } 
                else
                {
                    if(stck.peek()=='['&&ch==']'||
                    		stck.peek()=='('&&ch==')'||
                    		stck.peek()=='{'&&ch=='}'
                    )
                    {
                    	stck.pop();
                    }
                    else return false;
                }
            }
        } 
        if(stck.empty())
        {
            return true;
        }
        else return false;
    }
}