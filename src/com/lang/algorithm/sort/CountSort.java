package com.lang.algorithm.sort;

/**
 * Created by root on 2017/9/11.
 * 基本思想：用空间换时间
 */
public class CountSort {

    public void sort(int[] arr){
        if(arr==null){
            return;
        }
        int temp=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        int[] arrTemp=new int[temp+1];
        for (int i=0;i<arr.length;i++){
            arrTemp[arr[i]]+=1;
        }
        int k=0;
        for (int j=0;j<arrTemp.length;j++){
            if (arrTemp[j]!=0){
                arr[k++]=j;
            }
        }
    }

    public static void  main(String[] args){
        int[] arr={2,5,7,8,1,6};
        CountSort countSort=new CountSort();
        countSort.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
