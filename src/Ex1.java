public class Ex1 {
    public static void main(String[] args){
      int[] intArray={1,2,9,4,6,7};
      for(int x:intArray) {
          System.out.println(x);
      }
        System.out.println("Ascending Sorted Array is:");
        for(int x:sortArray(intArray)) {
            System.out.println(x);
        }
    }
     static  int[] sortArray(int[] intArray){
         int temp;
         for(int i=0;i<intArray.length;i++){
             for(int j=i+1;j<intArray.length;j++){
                 if (intArray[i] > intArray[j])
                 {
                     temp = intArray[i];
                     intArray[i] = intArray[j];
                     intArray[j] = temp;
                 }
             }
         }
         return intArray;
    }

}
