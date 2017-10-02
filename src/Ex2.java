public class Ex2 {
    public static void main(String[] args){
        int[] intArray1={1,2,8,4,6,7};
        int[] intArray2={1,2,9,4,6,7};
        boolean r= compareArrays(intArray1,intArray2);
        if (r==true)
            System.out.println("These two arrays are similar.");
        else
            System.out.println("These two arrays are not similar.");
    }
    static  boolean compareArrays(int[] intArray1,int[] intArray2){
        if (intArray1.length != intArray2.length)
            return false;
        for (int i=0;i<intArray1.length;i++) {
            if (intArray1[i] != intArray2[i])
                return false;
        }
        return true;
    }
}
