class Solution {
    public boolean canPartition(int[] nums) {
        
        int totalsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }

        if(totalsum % 2==1)
        return false;

        int sum=totalsum / 2;
        return isSubsetSum(nums,sum);
    }

    
    public static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][sum+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return func(n-1,sum, arr,dp);
    }
    
    public static boolean func(int index, int target, int[] arr, int[][] dp){
        
        //base case
        if(target==0){
            return true;
        }
        
        if(index==0){
            return ( arr[0] == target );
        }
        
        if(dp[index][target] != -1){
            return dp[index][target]==1;
        }
        
        boolean not_take=func(index-1,target, arr,dp);
        
        boolean take=false;
        
        if(target>=arr[index]){
           take=func(index-1, target-arr[index],arr,dp);
        }
        
        dp[index][target]=((take) || (not_take))? 1 :0;
        
        return (take) || (not_take);
    } 
}