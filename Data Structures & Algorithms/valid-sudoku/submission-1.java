class Solution {
    public boolean isValidSudoku(char[][] board) {
    
    Set<String> seen =  new HashSet<>();

    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char c= board[i][j];
            if(c != '.'){
                if(!seen.add(c + "row at" + i) ||
                 !seen.add(c + "column at" + j) ||
                  !seen.add(c + "box at" + i/3 + "-" + j/3)){
                    return false;
                }
            }

        }
    }
        return true;
    }
}
