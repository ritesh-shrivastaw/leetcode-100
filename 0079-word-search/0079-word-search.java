class Solution {
    public boolean exist(char[][] grid, String word) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(search(i,j,0,grid,word)){
                    return true;
                }
            }
            
        }
        return false;
        
    }
     boolean search(int i,int j,int k,char[][] grid,String word ){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=word.charAt(k)){
            return false;
        }
        if(k==word.length()-1) return true;
        char temp=grid[i][j];
        grid[i][j]='*';
        boolean found = search(i,j+1,k+1,grid,word) ||
                        search(i+1,j,k+1,grid,word) ||
                        search(i,j-1,k+1,grid,word) ||
                        search(i-1,j,k+1,grid,word) ;
        grid[i][j]=temp;
        return found;
     }
}