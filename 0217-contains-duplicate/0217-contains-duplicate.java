class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap <Integer,Integer> hashmap=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        hashmap.put(nums[i],hashmap.getOrDefault(nums[i],0)+1);

        if(hashmap.get(nums[i])>1){
            return true;
        }
      }

      return false;
    }
}