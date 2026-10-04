class Solution {
    public int findCircleNum(int[][] isConnected) {
      int n=isConnected.length;
      boolean visit[]=new boolean[n];
      int group=0;
      for(int i=0;i<n;i++){
        if(!visit[i]){
          group++;
          dfs(i,isConnected,visit);
        }
      }
      return group;
    }
  static void dfs(int city,int [][]isConnected.boolean visit[]){
    visit[city]=true;
    for(int i=0;i<isConnected.length;i++){
      if(isConnected[city][i]==1&&!visit[i]){
        dfs(i,isConnected,visit);
      }
    }
  }
}
        
        

