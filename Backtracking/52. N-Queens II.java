class Solution {
    static boolean isSafe(int r,int c, char[][] board, int n){
        //check left horizontal
        int row = r;
        int col = c;
        while(col>=0){
            //no change in row
            if(board[row][col] == 'Q'){
                return false;
            }
            col--;
        }
        //left upper diag
        row = r;
        col = c;
        while(row >= 0 && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }
        //left lower diag
        row = r;
        col = c;
        while(row < n && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    static void solve(char[][] board, int n, int c ,List<List<String>> ans){
        //base case
        if(c>=n){
            //we have reached a possible arrangement hence store it
            List<String> temp = new ArrayList<>();
            for(int i = 0; i<n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        // solve 1 case
        for(int r = 0; r<n; r++){
            if(isSafe(r,c,board,n)){
                //place queen
                board[r][c] = 'Q';
                //give other things to rec to handle
                solve(board,n,c+1,ans);
                //backtracking step
                //undo the queen placed
                board[r][c] = '.';
            }
        }

    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
       for(int i = 0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        //insert queens col wise
        int c = 0;
        List<List<String>> ans = new ArrayList<>();
        solve(board,n,c,ans);
        return ans.size();
    }
}
