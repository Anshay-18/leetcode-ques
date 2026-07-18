class Solution {
    public static int hcf(int a,int b){
        if(b%a==0) return a;
        return hcf(b%a,a);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return(hcf(nums[0],nums[nums.length-1]));
    }
}