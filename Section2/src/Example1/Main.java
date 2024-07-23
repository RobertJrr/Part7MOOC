package Example1;


//build in sorting algorithms

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


class Main {
    public static void main(String[] args) {
        int[] numbers = {8,3,7,9,1,2,4};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(8);
        numbers1.add(3);
        numbers1.add(7);

        System.out.println(numbers1);
        Collections.sort(numbers1);
        System.out.println(numbers1);
    }

}
