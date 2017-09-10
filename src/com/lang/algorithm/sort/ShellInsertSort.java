package com.lang.algorithm.sort;

/**
 * Created by lang on 2017/9/10.
 * 基本思路：增量插入排序
 */
public class ShellInsertSort {

    public void sort(int[] arr,int dx){
        if (arr==null)
            return;
        for(int i=dx;i<arr.length;i++){
            int temp=arr[i];
            int j=i-dx;
            for (;j>=0&&arr[j]>temp;j=j-dx){
                arr[j+dx]=arr[j];
            }
            arr[j+dx]=temp;
        }
    }

    public static void main(String[] args){

        int[] arr={5,8,3,2,1,3,2};
        ShellInsertSort shellInsertSort=new ShellInsertSort();
        shellInsertSort.sort(arr,1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
