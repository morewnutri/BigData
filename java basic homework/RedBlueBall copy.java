/*
实现双色球抽奖游戏中奖号码的生成，中奖号码由6个红球号码和1个蓝球号码组成。
其中红球号码要求随机生成6个1~33之间不重复的随机号码。其中蓝球号码要求随机生成1个1~16之间的随机号码。
 */

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class RedBlueBall {
    public static void main(String[] args){
        Random r = new Random();
        //my guess
        /*
        Scanner sc = new Scanner(System.in);
        int[] guess = new int[6];
        for(int i=0;i<6;i++){
            guess[i]=sc.nextInt();
        }

         */

        //ball number
        int[] num = new int[6];
        for(int i = 0;i<6;i++) {
            if (i < 5) {
                int tmp = r.nextInt((33 - 1) + 1) + 1;
                for(int j=0;j<i;j++){
                    if(tmp!=num[j]){
                        num[i]=tmp;
                    }
                }
            } else {
                num[i] = r.nextInt((16 - 1) + 1) + 1;
            }
        }

        System.out.println(Arrays.toString(num));

    }
}
