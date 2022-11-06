package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class The2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int j = 0;j < 3;j++){
            for(int i =0;i<3;i++){
                System.out.println(board[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(board));
    }
}
