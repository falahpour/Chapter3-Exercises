public class Ex4 {
    public static void main(String[] args){
        String[] names={"Ali","Seyed Hasan","Akbar","Seyed Reza"};
        System.out.println("Number of Seyed is:");
        System.out.println(numberOfSeyeds(names));
    }
    static  int numberOfSeyeds(String[] names){
        int i=0;
        for (String s:names) {
            if (s.startsWith("Seyed"))
                i+=1;
        }
        return i;
    }
}
