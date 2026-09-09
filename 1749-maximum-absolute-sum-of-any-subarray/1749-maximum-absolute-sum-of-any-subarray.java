class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        int res=Math.abs(nums[0]);
        for(int i=1; i<n; i++){
            int v1=nums[i]+max;
            int v2=nums[i];
            int v3=nums[i]+min;
            max=Math.max(v1,v2);
            min=Math.min(v3,v2);
            res=Math.max(res,Math.max(max,Math.abs(min)));
        }
        return res;
    }
}