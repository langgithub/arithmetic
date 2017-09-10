package com.lang.algorithm.sort;

/**
 * Created by root on 2017/8/21.
 * 基本思想：遍历取出插入元素，倒序比较大小，后移数组
 */
public class InsertSort {

    public void sort(int[] arr){
        if(arr.length==0)
            return;
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0&&arr[j]>temp;j--)
                arr[j+1]=arr[j];
            arr[j+1]=temp;
        }
    }

    public static void main(String[] args){
        System.out.println("插入排序！！！");
        int[] arr={3,5,2,8,6};//数组初始化时为0
        InsertSort insertSort=new InsertSort();
        insertSort.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
