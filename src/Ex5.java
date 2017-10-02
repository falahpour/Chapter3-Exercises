public class Ex5 {
    public static void main(String[] args){
        String s="hannah";
        boolean r= palindrome(s);
        if (r==true)
            System.out.println("The string is palindrome.");
        else
            System.out.println("The string is not palindrome.");
    }
    static  boolean palindrome(String s){
        int l=s.length();
        for (int i=0;i<l;i++) {
            if (s.charAt(i) != s.charAt(l-1-i))
                return false;
        }
        return true;
    }
}
