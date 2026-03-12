class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int more=target-num;
            if(hashmap.containsKey(more)){
                return new int[]{hashmap.get(more),i};
            }else{
                hashmap.put(num,i);
            }
        }
        return new int[]{-1,-1};
    }
}