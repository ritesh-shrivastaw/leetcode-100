class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int counts =0;
        int n= grid[0].length;
        int sx =0;
        int sy =0;
        int ex=0;
        int ey =0;
        int safebc=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    safebc++;
                }
                if(grid[i][j]==1){
                    sx =i;
                    sy =j;
                }
                if(grid[i][j] == 2){
                    ex =i;
                    ey =j;
                }
            }
        }
        int result = backtracking(sx,sy , ex,ey,m,n,counts,safebc,grid);
        return result;
        
    }
     int backtracking(int sx, int sy, int ex, int ey,int m , int n, int counts,int safebc , int grid[][]){
        if(sx<0 || sx>= m || sy<0 || sy>= n|| grid[sx][sy]==-1){
            return 0;
        }
        if(sx==ex && sy ==ey){
            if(counts==safebc){
                return 1;
            }
        }
        if(grid[sx][sy]==0){
            counts++;
        }
        int temp = grid[sx][sy];
        grid[sx][sy]=-1;
        int left =backtracking(sx-1,sy , ex,ey,m,n,counts,safebc,grid);
        int right =backtracking(sx+1,sy , ex,ey,m,n,counts,safebc,grid);
        int up = backtracking(sx,sy-1 , ex,ey,m,n,counts,safebc,grid);
        int down = backtracking(sx,sy+1 , ex,ey,m,n,counts,safebc,grid);
        grid[sx][sy] = temp;
        return left + right + up + down;
    }
}