/*2. 编程实现控制台版并支持两人对战的五子棋游戏。
        （1）绘制棋盘 - 写一个成员方法实现
        （2）提示黑方和白方分别下棋并重新绘制棋盘 - 写一个成员方法实现。
        （3）每当一方下棋后判断是否获胜 - 写一个成员方法实现。
        （4）提示： 采用二维数组来模拟并描述棋盘，棋盘如下：*/

import java.util.Scanner;

public class gobang {

    int[][] chessCoordiante = new int[16][16];

    int x = 0; /*坐标 */
    int y = 0;

    public boolean isblack=true;


    /*（1）绘制棋盘 - 写一个成员方法实现*/

    public void chessboard(){
        for(int i = 0;i<16;i++){
            for(int j =0;j<16;j++){
                if(i==0){
                    chessCoordiante[i][j]=j;   /*打印第一行*/
                }
                if(j==0){
                    chessCoordiante[i][j]=i;   /* 打印第一列*/
                }
                System.out.print(chessCoordiante[i][j]+" ");
            }
            System.out.println();
        }
    }

    /*（2）提示黑方和白方分别下棋并重新绘制棋盘 - 写一个成员方法实现。*/
    public void playChess(Scanner input){
        /*提示谁先下*/
        if(isblack){
            System.out.println("black's turn");
        }else{
            System.out.println("white's turn");
        }

        /*输入坐标*/
        System.out.println("pls input coordinate:");
        x = input.nextInt();
        y = input.nextInt();

        if(x>0&&x<16&&y>0&&y<16){ /*判断坐标是否合法*/
            if(chessCoordiante[x][y] != 0){  /*判断是否已经有棋子*/
                System.out.println("this coordinate is already occupied");
                playChess(input);
            }else{
                if(isblack){
                    chessCoordiante[x][y] = 1;  /*黑方为1*/
                }else{
                    chessCoordiante[x][y] = 2; /*白方为2*/
                }
            }
            isblack = !isblack;
            }else{
            System.out.println("iligel coordinate");
            playChess(input);
        }
    }
    /*(3）每当一方下棋后判断是否获胜 - 写一个成员方法实现。  */
    public boolean Check(){
        int count = 1;
        int currentPlayer = chessCoordiante[x][y]; /*记录当前检查的是黑棋还是白棋*/
        /*下方*/
        for(int i = y+1;i<16;i++){
            if(chessCoordiante[x][i] == currentPlayer){
                count++;
            }else{
                break;
            }
        }
        /*上方*/
        for(int i = y-1;i>0;i--){
            if(chessCoordiante[x][i] == currentPlayer){
                count++;
            }else{
                break;
            }
        }

        if(count==5){
            System.out.println("on vertical line"+count);
            return true;
        }else{
            count=1;
        }

        /*左边*/
        for(int i = x-1;i>0;i--){
            if(chessCoordiante[i][y] == currentPlayer){
                count++;
            }else{
                break;
            }
        }
        /*右边*/
        for(int i = x+1;i<16;i++){
            if(chessCoordiante[i][y] == currentPlayer){
                count++;
            }else{
                break;
            }
        }

        if(count==5){
            System.out.println("on horisontal line"+count);
            return true;
        }else{
            count=1;
        }
        /* /上 */
        for(int i = x+1,j=y-1;i<16&&j>0;i++,j--){
            if(chessCoordiante[i][j] == currentPlayer){
                count++;
            }else{
                break;
            }
        }
        /* /下 */
        for(int i = x-1,j=y+1;i>0&&j<16;i--,j++){
            if(chessCoordiante[i][j] == currentPlayer){
                count++;
            }else{
                break;
            }
        }

        if(count==5){
            System.out.println("on / line"+count);
            return true;
        }else{
            count=1;
        }

        /* \上 */
        for(int i = x-1,j=y-1;i>0&&j>0;i--,j--){
            if(chessCoordiante[i][j] == currentPlayer){
                count++;
            }else{
                break;
            }
        }
        /* \下 */
        for(int i = x+1,j=y+1;i<16&&j<16;i++,j++){
            if(chessCoordiante[i][j] == currentPlayer){
                count++;
            }else{
                break;
            }
        }

        if(count==5){
            System.out.println("on diagonal line"+count);
            return true;
        }else{
            count=1;
        }
        return false;
    }

    public static void main(String[] args){
        gobang chess = new gobang();
        Scanner input = new Scanner(System.in);
        while (true){
            chess.chessboard();
            chess.playChess(input);
            if(chess.Check()){
                if(chess.isblack){
                    System.out.println("white win");/* 因为playChess最后isblack = !isblack而转换*/
                }else{
                    System.out.println("black win");
                }
                break;
            }

        }


    }
}
