class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        {
            return s;
        }
        String[] str=new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            str[i]="";
        }
        boolean flag=true;
        int i=0,j=0,k=0; 
        for(i=0;i<s.length();i++)
        {
            if(flag==true)
            {
                str[j]=str[j]+s.charAt(i);
                j++; 
                if(j==numRows)
                {
                    flag=false; 
                    j-=2;
                }
            }
            else{
                str[j]=str[j]+s.charAt(i);
                j--; 
                if(j==-1)
                {
                    flag=true; 
                    j=1;
                }
            }
        }  
        String result=""; 
        while(k<numRows)
        {
            System.out.println(str[k]);
            result+=str[k]; 
            k++;
        }
        System.out.println(result);   
        
        return result;
    }

}


