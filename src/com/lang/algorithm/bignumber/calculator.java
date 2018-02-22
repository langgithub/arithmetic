package com.lang.algorithm.bignumber;

/**
 * Created by lang on 2018/2/22.
 * 大数字运算的计算器
 * 1.将数字拆分放入数组
 * 2.数组=数组*大数
 * 3.进位和留数
 */
public class calculator {

    public static void main(String[] args){
        //754*16
        int[] arr=new int[100];
        arr[arr.length-1]=1;
        arr=get(arr,3);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static int[] get(int[] arr,int num){
        if(num==1){
            return arr;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]*num;
        }
        //进位和留位
        for (int i=arr.length-1;i>0;i--){
            arr[i-1]+=arr[i]/10;
            arr[i]=arr[i]%10;
        }
        return get(arr,num-1);
    }
}
