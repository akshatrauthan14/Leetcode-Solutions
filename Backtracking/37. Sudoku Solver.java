class Solution {
    static boolean isSafe(char[][] board, char ch, int row, int col){
        //check for horizontal: row is same, col moves 0 to 9
        for(int c = 0; c<9; c++){
            if(board[row][c] == ch){
                return false;
            }
        }
        //check for vertical: row moves 0 to 9, col is same
        for(int r = 0; r<9; r++){
            if(board[r][col] == ch){
                return false;
            }
        }
        //check for 3x3 box
        int startRow = row - row%3;
        int startCol = col - col%3;
        for(int i=0;i<3; i++){
            for(int j = 0; j<3; j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if(board[actualRow][actualCol] == ch){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean findEmptyCell(char[][] board, int[] emptyCell){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(board[i][j] == '.'){
                    //store row and col of empty cell
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean solve(char[][] board){
        //base case: No empty cell
        int[] emptyCell = new int[2];
        if(!findEmptyCell(board,emptyCell)){
            return true;
        }
        // if i is empty cell
        int row = emptyCell[0];
        int col = emptyCell[1];
        //try to put every value in empty cell
        for(int i = 1; i<=9; i++){
            char ch = (char)(i+'0');
            if(isSafe(board,ch,row,col)){
                //place the values
                board[row][col] = ch;
                //recursive call and ans found
                if(solve(board) == true){
                    return true;
                }
                //if ans not found then backtrack
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}
