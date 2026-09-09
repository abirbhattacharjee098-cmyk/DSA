class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int curMax = nums[0];
        int curMin = nums[0];
        int max = nums[0];
        int min = nums[0];
        int total = nums[0];
        
        for (int i = 1; i < n; i++) {
            int v1 = curMax + nums[i];
            int v2 = curMin + nums[i];
            int v3 = nums[i];
            
            curMax = Math.max(v1, v3);
            curMin = Math.min(v2, v3);
            
            max = Math.max(max, curMax);
            min = Math.min(min, curMin);
            
            total += nums[i];
        }
        
        if (max < 0) return max;
        return Math.max(max, total - min);
    }
}