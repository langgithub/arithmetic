package com.lang.algorithm.sort;

/**
 * Created by root on 2017/9/11.
 * 基本思想：
 * 1.建立初始化堆从 n/2~0 堆排，每次堆排除了本身有序还必须使其子节点也堆排有序
 * 2.将最后一位与第一位互换，堆排（0~n-1）
 */
public class HeapSort {

    public void HeapAjust(int[] arr,int start,int end){
        int temp=arr[start];
        for (int i=2*start+1;i<=end;i*=2){
            if(i<end&&arr[i]<arr[i+1]){
                i++;
            }
            if(temp>arr[i]){
                break;
            }
            arr[start]=arr[i];
            start=i;
        }
        arr[start]=temp;
    }


    public static void main(String[] args){
        int[] arr={1, 3, 4, 5, 2, 6, 9, 7, 8, 0,89,45,12};
        HeapSort heapSort=new HeapSort();
        for(int i=arr.length/2;i>=0;i--){
            heapSort.HeapAjust(arr,i,arr.length-1);
        }

        for (int j=arr.length-1;j>=0;j--){
            int temp=arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            heapSort.HeapAjust(arr,0,j-1);
        }

        for (int w=0;w<arr.length;w++){
            System.out.print(arr[w]+"\t");
        }

    }
}
