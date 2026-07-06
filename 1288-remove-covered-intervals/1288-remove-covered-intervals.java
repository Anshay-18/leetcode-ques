class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        
        Arrays.sort( nums, (a,b) -> {
            if( a[0] == b[0] ) return b[1] - a[1];
            return a[0] - b[0];
        });

        int cnt  = 0;
        int maxY = nums[0][1];
        
        for( int i = 1; i < nums.length ; i++){

            if( maxY >= nums[i][1]) cnt++;
            else maxY = nums[i][1];

        }

        return nums.length - cnt;
    }
}