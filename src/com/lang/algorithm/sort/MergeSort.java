package com.lang.algorithm.sort;

/**
 * Created by lang on 2017/9/10.
 */
public class MergeSort {

    public void sort(int[] arr,int left,int right){
        if(arr==null||left>=right)
            return;
        int m=(left+right)/2;
        sort(arr,left,m);
        sort(arr,m+1,right);
        merge(arr,left,m,right);
        System.out.println(left+":"+m+":"+right);
    }
    private void merge(int[] arr, int left, int m, int right) {
        int i=left;
        int j=m+1;
        int[] temp=new int[arr.length];
        int k=0;
        while (i<=m&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
            }
        }
        if(i<=m){
            temp[k++]=arr[i++];
        }
        if(j<=right){
            temp[k++]=arr[j++];
        }
        k=0;
        while (left<=right){
            arr[left++]=temp[k++];
            for(int w=0;w<arr.length;w++){
                System.out.print(arr[w]+"\t");
            }
        }


    }
    public static void main(String[] args){
        int[] arr={5,6,6,5,3};
        MergeSort mergeSort=new MergeSort();
        mergeSort.sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
