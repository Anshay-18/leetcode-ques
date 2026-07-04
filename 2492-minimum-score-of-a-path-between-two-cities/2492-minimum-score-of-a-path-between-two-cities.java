class Solution {

    public class Pair{
        int v;
        int cost;
        public Pair( int v , int cost){
            this.v = v;
            this.cost = cost;
        }
    }

    public int minScore(int n, int[][] roads) {
        
        boolean[] vis = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        int min = Integer.MAX_VALUE;
        List<List<Pair>> adj = new ArrayList<>();

        for( int i =0; i< n+1; i++) {
            List<Pair> list = new ArrayList<>();
            adj.add( list );
        }

        for( int i = 0; i< roads.length; i++){

            int u = roads[i][0];
            int v = roads[i][1];
            int dis = roads[i][2];

            adj.get(u).add(new Pair(v,dis));
            adj.get(v).add( new Pair(u,dis));

        }

        if( adj.size() > 0) {
            q.add(1);
            vis[1] = true;
        }

        while( !q.isEmpty()){
            int k = q.remove();
            vis[k] = true;

            for( int j = 0; j< adj.get(k).size(); j++){

                Pair p = adj.get(k).get(j);
                int v = p.v;
                int cost = p.cost;
                min = Math.min(cost, min);
                
                if( !vis[v]){
                    q.add( v );
                    vis[v] = true;
                }
            }
        }

        return min;
        
    }
}