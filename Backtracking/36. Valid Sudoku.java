class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row<9; row++){
            for(int col = 0; col<9; col++){
                char ch = board[row][col];
                //ignore empty cells
                if(ch == '.'){
                    continue;
                }
                //for every check, check curr col too to remove
                //check for horizontal: row is same, col moves 0 to 9
                for(int c = 0; c<9; c++){
                    if(c!=col && board[row][c] == ch){
                        return false;
                    }
                }
                //check for vertical: row moves 0 to 9, col is same
                for(int r = 0; r<9; r++){
                    if(r!=row && board[r][col] == ch){
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
                        if((actualRow != row || actualCol != col) && board[actualRow][actualCol] == ch){
                            return false;
                        }
                    }
                }
            }                    
        }
        return true;
    }
}
