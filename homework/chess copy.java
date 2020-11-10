/*
使用双重循环实现五子棋游戏棋盘的绘制，
 */

import java.util.Arrays;

public class chess {
    public static void main(String[] args){
        char[][] chess= new char[17][17];

        //chessboard
        for(int i=1;i<chess.length;i++){
            for(int j=1;j<chess[i].length-1;j++){
                chess[i][j]='+';
            }
        }

        //first row
        for(int i=1;i<chess.length;i++){
            if(i<=10){
                chess[0][i]=(char)(48+i-1);
            }else{
                chess[0][i]=(char)(86+i);
            }
        }

        //first column
        for(int i=1;i<chess.length;i++){
            if(i<=10){
                chess[i][0]=(char)(48+i-1);
            }else{
                chess[i][0]=(char)(86+i);
            }
        }

        for(int i=0;i<chess.length;i++) {
            for (int j = 0; j < chess[i].length - 1; j++) {
                System.out.print(chess[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        //System.out.println(Arrays.toString(chess));
    }

}
