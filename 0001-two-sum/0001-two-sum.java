class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++)
        {
            int res = target - nums[i];
            if(h.containsKey(res))
            {
                return new int[] {h.get(res) , i};
            }
            else
            {
                h.put(nums[i] , i);
            }
        } 
        return new int[] {-1};       
    }
}
