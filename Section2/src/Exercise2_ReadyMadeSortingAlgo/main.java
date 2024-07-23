package Exercise2_ReadyMadeSortingAlgo;

import java.util.Collections; //for lists
import java.util.Arrays;
import java.util.ArrayList;


class main {
    public static void main(String[] args) {
        int[] numbers = {4,5,7,1,0,9};
        String[] strings = {"dog","cat","butterfly","echo"};

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> stringObjects = new ArrayList<>();
        integers.add(5);
        integers.add(1);
        integers.add(11);
        integers.add(4);

        stringObjects.add("dog");
        stringObjects.add("cat");
        stringObjects.add("butterfly");
        stringObjects.add("echo");

        //Before
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));
        System.out.println("=======================");
        System.out.println(integers);
        System.out.println(stringObjects);

        sort(numbers);
        sort(strings);
        sortIntegers(integers);
        sortStrings(stringObjects);

        //After
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));
        System.out.println("=======================");
        System.out.println(integers);
        System.out.println(stringObjects);



    }

    public static void sort(int[] arr){
        Arrays.sort(arr);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
}
