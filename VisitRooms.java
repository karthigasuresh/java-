class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean visit[]=new boolean[n];
        dfs(0,rooms,visit);
        for(int i=0;i<rooms.size();i++){
            if(!visit[i]){
                return false;
            }
        }
        return true;
    }
    static void dfs(int start,List<List<Integer>> rooms,boolean visit[]){
        visit[start]=true;
        for(int i=0;i<rooms.get(start).size();i++){
          int next=  rooms.get(start).get(i);
          if(!visit[next]){
            dfs(next,rooms,visit);
          }
        }
    }
}
