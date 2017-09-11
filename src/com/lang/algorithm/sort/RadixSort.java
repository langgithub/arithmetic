package com.lang.algorithm.sort;

import java.util.ArrayList;

/**
 * Created by root on 2017/9/11.
 */
public class RadixSort {

    public void Sort(int[] array){

        //首先确定排序的趟数;
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }

        int time=0;
        //判断位数;
        while(max>0){
            max/=10;
            time++;
        }

        //建立10个队列;
        ArrayList<Integer>[] queue=new ArrayList[10];
        for(int i=0;i<10;i++){
            queue[i]=new ArrayList<Integer>();
        }

        //进行time次分配和收集;
        for(int i=0;i<time;i++){

            //分配数组元素;
            for(int j=0;j<array.length;j++){
                //得到数字的第time+1位数;
                queue[array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i)].add(array[j]);
            }
            int count=0;//元素计数器;
            //收集队列元素;add
            for(int k=0;k<10;k++){
                for (int w=0;w<queue[k].size();w++){
                    System.out.print(queue[k].toString());
                    array[count]=queue[k].get(w);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args){

        int[] arr={278,109,63,930,589,184,505,269,8,83};
        RadixSort radixSort=new RadixSort();
        radixSort.Sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
