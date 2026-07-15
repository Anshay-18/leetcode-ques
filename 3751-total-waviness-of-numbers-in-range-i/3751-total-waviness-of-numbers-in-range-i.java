class Solution {

    public int countWavy( int n){

        String s = String.valueOf(n);
        int c = 0;
        for( int i= 1; i< s.length()-1; i++){
            char ch = s.charAt(i);

            if( s.charAt(i-1) < ch && s.charAt(i+1) < ch) c++;
            else if(  s.charAt(i-1) > ch && s.charAt(i+1) > ch) c++;

        }
        return c;
    }
    public int totalWaviness(int num1, int num2) {
        
        int cnt  = 0;
        for( int i= num1; i<= num2; i++){

            cnt += countWavy(i);
        }

        return cnt;
    }
}