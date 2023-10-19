class Solution {
public:
    int romanToInt(string s) { 
        int total=0; 
        int l=s.length();
         unordered_map<char,int> mp{
             {'I',1},
             {'V',5},
             {'X',10},
             {'L',50},
             {'C',100},
             {'D',500},
             {'M',1000},
         }; 
         for(int i=0;i<l;i++)
         {
            if(mp[s[i]]<mp[s[i+1]])
            {
                total=total+(mp[s[i+1]]-mp[s[i]]); 
                i++;
            }   
            else
            {
                total=total+mp[s[i]];
            }
         } 
         return total;
    }
};