package Exercise1_SortingAlgorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {6,5,8,7,11};
        System.out.println("Smallest: " + smallest(numbers));
        System.out.println("Smallest index: " + indexOfSmallest(numbers));

        int[] numbers2 = {-1,6,9,8,12};
        System.out.println(indexOfSmallestFrom(numbers2,0));
        System.out.println(indexOfSmallestFrom(numbers2,1));
        System.out.println(indexOfSmallestFrom(numbers2,2));

        //use toString class method of class Arrays.
        //it formats an array into an easily readable string
        int[] numbers3 = {3,2,5,4,8};
        System.out.println(Arrays.toString(numbers3));

        swap(numbers3,1,0);
        System.out.println(Arrays.toString(numbers3));

        swap(numbers3, 0,3);
        System.out.println(Arrays.toString(numbers3));


        //for sorting
        int[] numbers4 = {8,3,7,9,1,2,4};
        sort(numbers4);
    }

    //sort
    public static void sort(int[] arr){

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            //get the smallest index starting from i
            int smallestIndex = indexOfSmallestFrom(arr,i);
            //swap smallestIndex starting from i and i itself
            swap(arr,i,smallestIndex);
            //printing out after each loop
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void swap(int[] arr, int index1, int index2){
        //hold value of arr[index1] so we dont lose it
        int temp = arr[index1];
        //assign value of index2 to index1
        arr[index1] = arr[index2];
        //assign value of index1 to index2 using temp
        arr[index2] = temp;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallestindex = startIndex;
        for(int i = startIndex + 1; i < table.length; i++){
            if(table[smallestindex] > table[i]){
                smallestindex = i;
            }
        }
        return smallestindex;
    }

    public static int indexOfSmallest(int[] arr){
        int smallestIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[smallestIndex] > arr[i]){
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int smallest(int[] arr){
        int smallest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
