class SmallestInfiniteSet {

    PriorityQueue<Integer> pq ;
    int[] nums;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        nums = new int[1001];
        for( int i = 1; i<= 1000; i++){
            pq.add(i);
            nums[i] = 1;
        }
        
    }
    
    public int popSmallest() {
        int i = pq.remove();
        nums[i] = 0; 
        return i;
    }
    
    public void addBack(int num) {
        if( nums[num] != 0) return;
        nums[num] = 1;
        pq.add( num );
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */