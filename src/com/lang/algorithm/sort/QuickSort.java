package com.lang.algorithm.sort;

/**
 * Created by root on 2017/9/11.
 * 基本思想：
 * 1.找出枢纽
 * 2.先右后左，找出不符合左小右大的 i,j 交换
 * 3.i=j 枢纽归为
 * 4.左递归快排，右递归快排
 */
public class QuickSort {

    public void sort(int[] arr,int left,int right){

        if (arr==null||left>=right)
            return;
        int temp=arr[left];
        int i=left+1,j=right;
        while (i<j){
            while (arr[j]>=temp&&i<j){
                j--;
            }
            while (arr[i]<temp&&i<j){
                i++;
            }
            if(i<j){
                int m=arr[i];
                arr[i]=arr[j];
                arr[j]=m;
            }
        }
        arr[left]=arr[i];
        arr[i]=temp;
        sort(arr,left,i-1);
        sort(arr,i+1,right);

    }
    public static void main(String[] args){
        int[] arr={6,3,7,8,6};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
