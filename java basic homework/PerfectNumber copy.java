/*
2.编程题编程找出1000以内的所有完数并打印出来。所谓完数就是一个数恰好等于它的因子之和，如：6=1＋2＋3.
 */

public class PerfectNumber {
    public static void main(String[] args){

        int num = 2;
        //int count = 0;
        while(num<=1000){
            int count = 0;
            for(int i = 1;i <= num/2;i++ ){
                if(num%i==0){
                    count += i;
                    //System.out.println("num: "+i+" "+num);
                    //System.out.println("count: "+ count+" "+num);
                }else{
                    continue;
                }
                /*
                if(count==num){
                    System.out.println(num+" is perfect number");

                 */
                }
            if(count==num){
                System.out.println(num+" is perfect number");
            }
            num = num+1;
        }
    }
}
