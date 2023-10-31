class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
		Set<List<Integer>> list=new HashSet<>();
	        for(int i=0;i<nums.length;i++)
	        {
	            int j=i+1;  
	            int l=j+1; 
	            int k=nums.length-1;
	            while(l<k)
	            {
	                long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];  
	                if(sum==target)
	                {
	                     List<Integer> l1=new ArrayList<>(); 
	                     l1.add(nums[i]);
	                     l1.add(nums[j]);
	                     l1.add(nums[l]);
	                     l1.add(nums[k]);
	                     list.add(new ArrayList<Integer>(l1)); 
	                    
	                }  
	                else if(sum<target){ 
	                   l++; 
	                   k=nums.length;
	                } 
	                if(k==l+1||k==l)
	                {
	                	j++;
	                	l=j+1;
	                	k=nums.length;
	                }
	                k--;
	            }
	        } 
            List<List<Integer>> list1=new ArrayList<>(list);
	        return list1;
    }
}