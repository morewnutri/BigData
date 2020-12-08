/*
 定义一个长度为[16][16]的整型二维数组并输入或指定所有位置的元素值，分别实现二维数组中所有行和所有列中所有元素的累加和并打印。
再分别实现二维数组中左上角到右下角和右上角到左下角所有元素的累加和并打印。
 */

import java.util.Random;

public class arraySum {
    public static void main(String[] args){
        int[][] arrays = new int[16][16];
        Random rand = new Random();
        int temp = 0;
        /* 初始化数组 */
        for(int i = 0;i<arrays.length;i++){
            for(int j = 0;j<arrays.length;j++){
                arrays[i][j]=rand.nextInt(10);
            }
        }

        /*打印数组 */
        System.out.println("---array---");
        for(int i = 0;i<arrays.length;i++){
            for(int j = 0;j<arrays.length;j++){
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println("");
        }

        /* 实现二维数组中所有行中所有元素的累加 */
        System.out.println("---sum of row---");
        for(int i=0;i< arrays.length;i++){
            int sum = 0;
            for(int j=0;j< arrays.length;j++){
                sum = sum+arrays[i][j];
            }
            System.out.println("sum of "+i+" row is "+ sum);
        }

        /* 实现二维数组中所有column中所有元素的累加 */
        System.out.println("---sum of columns---");
        int arrays1[][] = new int[16][16];

        for(int i=0;i<arrays.length;i++){
            for(int j=0;j< arrays.length;j++){
                arrays1[j][i]=arrays[i][j];
            }
        }

        for(int i=0;i<arrays1.length;i++){
            int sum = 0;
            for(int j=0;j< arrays1.length;j++){
                sum = sum+arrays1[i][j];
            }
            System.out.println("sum of "+i+" column is "+ sum);
        }


       /* 二维数组中左上角到右下角所有元素的累加和并打印。*/
        int sum1=0;
        for(int i =0;i<arrays.length;i++){
            for(int j =0;j<arrays.length;j++){
                if((i+1)==j){
                    sum1 = sum1+arrays[i][j];
                }
            }
        }
        System.out.println("---sum of diagonal elements---");
        System.out.println("sum of diagonal elements is "+ sum1);

        /*右上角到左下角所有元素的累加和并打印。*/
        sum1=0;
        for(int i =0;i<arrays.length;i++){
            for(int j =0;j<arrays.length;j++){
                if((i+j)==arrays.length){
                    sum1 = sum1+arrays[i][j];
                }
            }
        }
        System.out.println("---sum of diagonal elements---");
        System.out.println("sum of diagonal elements is "+ sum1);

    }
}
