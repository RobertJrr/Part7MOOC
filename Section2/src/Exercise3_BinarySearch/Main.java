package Exercise3_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Book book = new Book(1234, "Robert");
        Book book1 = new Book(4398, "Robert");
        Book book2 = new Book(5400, "Robert");
        Book book3 = new Book(1111, "Robert");
        Book book4 = new Book(6700, "Robert");
        Book book5= new Book(4723, "Robert");
        Book book6= new Book(1920, "Robert");
        Book book7 = new Book(2904, "Robert");


        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        System.out.println("Index found at: " + linearSearch(books,1234));
        System.out.println("Index found at: " + binarySearch(books,6700));


    }


    //comments are based on this example
    public static int binarySearch(ArrayList<Book> books, int searchID){
        //intializing array with the ids in books list
        int[] ids = new int[books.size()];
        for(int i = 0; i < ids.length; i++){
            ids[i] = books.get(i).getID();
        }
        //sorting the array
        Arrays.sort(ids);
        System.out.println("Sorted: " + Arrays.toString(ids));

        //doing binary search
        //getting begin and end of search
        int begin = 0;
        int end = ids.length - 1;

        while(begin <= end){
            //to start at middle index
            int middle = (end + begin) / 2; //starts at 3
            //if found at middle, return index
            if(ids[middle] == searchID){ //returns index 3 if found at beginning
                return middle;
            }
            //if value at middle is smaller than searched. new begin equals middle + 1;
            if(ids[middle] < searchID){
                //if value at middle index is smaller, set a new value to begin searching at;
                //so begin = 3 + 1, begin next loop search at 4 index.
                //before started at 3. no point in searching at index 3 and lower since search ID is greater
                begin = middle + 1;
            }

            //if value middle is greater than search id, set new value to end at
            if(ids[middle] > searchID){
                end = middle - 1; // 3 - 1 = 2; so end at 2 now.
                //started searching at index 3, but value is greater. So no point in searching further.
                // new end is now 2 and not 7
            }
        }

        //if not found, return -1
        return -1;

    }


    public static int linearSearch(ArrayList<Book> books, int searchId){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getID() == searchId){
                return i;
            }
        }
        return -1;
    }


}
