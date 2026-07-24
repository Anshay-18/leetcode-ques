class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int[] nums = new int[2001];

        for( int n : arr) {
            nums[n + 1000]++;
        }

        Set<Integer> set = new HashSet<>();
        for( int n : nums ){
            if( n == 0) continue;
            if( set.contains(n)) return false;
            set.add(n);
        }

        return true;
    }
}