class Solution {
    static boolean check(char[][] board,int i,int j,char k){
        int si=(i/3)*3;
        int sj=(j/3)*3;
        for(int n=0;n<9;n++){
            if(board[n][j]==k || board[i][n]==k){
                return false;
            }
            if(board[si+n%3][sj+n/3]==k){
                return false;
            }
        }
        return true;
    }
    public static boolean solve(char[][]board, int i, int j){
        if(i>=9){
            return true;
        }
        if(board[i][j]=='.'){
            for(char k='1';k<='9';k++){
                if(check(board,i,j,k)){
                    board[i][j]=k;
                    boolean result;
                    if(j<8){
                        result = solve(board,i,j+1);
                    }
                    else{
                        result = solve(board,i+1,0);
                    }
                    if(result){
                        return true;
                    }
                    else{
                        board[i][j]='.';
                    }
                }
            }
            return false;
        }
        if(j<8){
            return solve(board,i,j+1);
        }
        else{
            return solve(board,i+1,0);
        }
    }
    public void solveSudoku(char[][] board) {
        solve (board,0,0);
    }
}
