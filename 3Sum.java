class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();   
        boolean flag=false;
        for(int i:nums)
        {
            if(i<0)
            {
                flag=false; 
            }
        } 
        if(flag) return list; 
       Arrays.sort(nums);  
       for(int i=0;i<nums.length-1;i++)
       {
           if(i>0&&nums[i]==nums[i-1])
           {
        	  continue; 
           }
    	   int j=i+1; 
           int k=nums.length-1; 
           while(j<k)
           {
               int sum=nums[i]+nums[j]+nums[k];
               if(sum==0)
               {
                  list.add(Arrays.asList(nums[i],nums[j],nums[k]));  
                  int n=k;
                  if(nums[j]==nums[j+1]) { while(nums[k]==nums[n]&&j<k)k--;}
                  else j++;
               } 
               else if(sum>0)
               {
                   k--;
               } 
               else j++;
           }
        }
       return list;
    }
}