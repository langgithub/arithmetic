package com.lang.algorithm.sort;

/**
 * Created by root on 2017/8/21.
 * 基本思想：两两比较，大的后移
 */
public class BubbleSort {

    public void sort(int[] arr){

        if(arr.length==0)
            return;
        for (int i=0;i<arr.length-1;i++){
            for (int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("冒泡排序！！！");
        int[] arr={3,5,2,8,6};//数组初始化时为0
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
