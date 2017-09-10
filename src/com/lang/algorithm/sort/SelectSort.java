package com.lang.algorithm.sort;

/**
 * Created by lang on 2017/9/10.
 * 基本思想：遍历选择出数组中最大/小所代表的下标。 并将下标所代表的数加入已经排好序的数组
 */
public class SelectSort {

    public void sort(int[] arr){
        if(arr==null)
            return;
        for(int i=0;i<arr.length-1;i++){
            int d=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[d]>arr[j]){
                    d=j;
                }
            }
            if(d!=i){
                int temp=arr[i];
                arr[i]=arr[d];
                arr[d]=temp;
            }
        }
    }

    public static void main(String[] args){
        int[] arr={4,3,2,1,4,6,8};
        SelectSort selectSort=new SelectSort();
        selectSort.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
