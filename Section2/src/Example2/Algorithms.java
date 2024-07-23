package Example2;

 class Algorithms {

     public static int linearSearch(int[] arr, int searched) {
         for(int i = 0; i < arr.length; i++){
             if(arr[i] == searched){
                 return i;
             }
         }
         return -1;
     }
 }
