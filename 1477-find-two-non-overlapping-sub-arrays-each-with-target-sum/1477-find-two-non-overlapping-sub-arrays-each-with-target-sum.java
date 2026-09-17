class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLen = new int[n]; // minLen[i] stores the minimum length of a target sub-array ending at or before index i
        java.util.Arrays.fill(minLen, Integer.MAX_VALUE);
        
        int left = 0;
        int currentSum = 0;
        int ans = Integer.MAX_VALUE;
        int currentMin = Integer.MAX_VALUE;
        
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];
            while (currentSum > target) {
                currentSum -= arr[left];
                left++;
            }
            if (currentSum == target) {
                int len = right - left + 1;
                if (left > 0 && minLen[left - 1] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, minLen[left - 1] + len);
                }
                
                currentMin = Math.min(currentMin, len);
            }
            minLen[right] = currentMin;
        }
        
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}