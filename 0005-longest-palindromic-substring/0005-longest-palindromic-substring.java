class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        int max = 1;
        int p = 0; int q =0;

        for(int k =0 ; k< n; k++){

            int j = k; int i =0; 
            while( j< n ){
                
                if( i == j) dp[i][j] = true;
                else if( s.charAt(i) == s.charAt(j)){
                    if(dp[i+1][j-1] || i== j-1) dp[i][j] = true;
                }
                if( dp[i][j] == true){
                    if( max < j-i+1 ){
                        p= i; 
                        q = j;
                        max = j-i+1;
                    }
                }
                i++;
                j++;
            }

        }
        return s.substring(p,q+1);
    }
}