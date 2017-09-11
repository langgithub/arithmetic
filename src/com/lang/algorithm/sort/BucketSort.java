package com.lang.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by root on 2017/9/11.
 * 基本思路
 * 1.桶划分，初始化桶
 * 2.桶填充
 * 3.桶内排序
 */
public class BucketSort {

    public void sort(int[] arr){

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        //初始化桶
        int bucketSize=(max-min)/arr.length+1;
        ArrayList<Integer>[] bucket=new ArrayList[bucketSize];
        for (int i=0;i<bucketSize;i++){
            bucket[i]=new ArrayList<>();
        }
        //桶填充
        for(int i=0;i<arr.length;i++){
            int  index = (arr[i] - min) / arr.length;
            bucket[index].add(arr[i]);
        }
        //桶内排序
        int k=0;
        for (int i=0;i<bucketSize;i++){
            Collections.sort(bucket[i]);
            for (int j=0;j<bucket[i].size();j++){
                arr[k++]=bucket[i].get(j);
            }
        }

    }

    public static void main(String[] args){

        int[] arr={123,78,4,5,54,56,153,986};
        BucketSort bucketSort=new BucketSort();
        bucketSort.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
