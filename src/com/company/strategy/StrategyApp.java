package com.company.strategy;

import java.util.Arrays;

public class StrategyApp {
    public static void main(String[] args) {
        StrategyClient c = new StrategyClient();

        int[] arr1 = {1,2,3,1};
        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr1);

        int[] arr2 = {11,4,2,5,67,5,12};
        c.setStrategy(new InsertingSort());
        c.executeStrategy(arr2);

        int[] arr3 = {1,4,6,8,2,1,3,-12};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr3);

    }
}
interface Sorting{
    void sort(int[] arr);
}
class StrategyClient{
    Sorting strategy;
    public void setStrategy(Sorting strategy) {this.strategy = strategy;}
    public void executeStrategy(int[] arr){
        strategy.sort(arr);
    }
}
class BubbleSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка пузырьком");
        System.out.println("До:\t"+ Arrays.toString(arr));
        for(int barrier=arr.length-1;barrier>=0;barrier--){
            for (int i=0;i<barrier;i++){
                if (arr[i]>arr[i+1]){
                    int tmp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }
        System.out.println("После:\t"+Arrays.toString(arr));
    }
}
class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        System.out.println("До:\t"+ Arrays.toString(arr));
        for(int barrier=0;barrier<arr.length-1;barrier++){
            for (int i=barrier+1;i<arr.length;i++){
                if (arr[i]<arr[barrier]){
                    int tmp = arr[i];
                    arr[i]= arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
        System.out.println("После:\t"+Arrays.toString(arr));
    }
}
class InsertingSort implements Sorting{
    @Override
    public void sort(int[] arr) {
        System.out.println("Сортировка вставками");
        System.out.println("До:\t"+ Arrays.toString(arr));
        for(int barrier=1;barrier<arr.length;barrier++){
            int index=barrier;
            while (index-1>=0 && arr[index]<arr[index-1]){
                int tmp = arr[index];
                arr[index] = arr[index-1];
                arr[index-1] = tmp;
                index--;

            }
        }
        System.out.println("После:\t"+Arrays.toString(arr));
    }
}


