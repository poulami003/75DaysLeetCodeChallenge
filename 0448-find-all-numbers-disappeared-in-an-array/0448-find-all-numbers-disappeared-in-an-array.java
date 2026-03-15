class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0));
        }

        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}