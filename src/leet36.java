import java.util.*;
public class leet36 {

    public boolean isValidSudoku(char[][] board) {
        boolean num[] = new boolean[10];
        for(int i=0; i<board[0].length; i++){//세로줄 검사
            Arrays.fill(num,false);
            for(int j=0; j<board.length; j++){
                if(board[j][i] != '.'){
                    if(!num[board[j][i]-'0'])
                        num[board[j][i]-'0'] = true;
                    else{
                        System.out.println(i+"*"+j);
                        return false;
                    }
                }
            }
        }
        for(int i=0; i<board.length; i++){//가로줄 검사
            Arrays.fill(num,false);
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    if(!num[board[i][j]-'0'])
                        num[board[i][j]-'0'] = true;
                    else{
                        System.out.println(i+"&"+j);
                        return false;
                    }
                }
            }
        }

        for(int i=0; i<board.length; i+=3){//3x3 검사
            for(int j=0; j<board.length; j+=3){
                if(!func(i,j,board))
                    return false;
            }
        }
        return true;
    }
    public boolean func(int x, int y, char[][] board) {
        boolean num[] = new boolean[10];
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] != '.') {
                    if (!num[board[i][j] - '0'])
                        num[board[i][j] - '0'] = true;
                    else {
                        System.out.println(i + " " + j);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
