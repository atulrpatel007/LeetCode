class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board);
    }
    static boolean sudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for(char ch = '1'; ch <= '9'; ch++) {
                        if(solve(board, ch, i, j)) {
                            board[i][j] = ch;
                            if(sudoku(board)) {
                                return true;
                            }
                            else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    static  boolean solve(char[][] board, char c,int i,int j) {
        for (int l = 0; l < board.length; l++) {
            if (board[l][j] == c) {
                return  false;
            }
            if (board[i][l] == c) {
                return  false;
            }
            if(board[3*(i/3) + l/3][3*(j/3) + l%3] == c) {
                return  false;
            }
        }
        return  true;
    }
}