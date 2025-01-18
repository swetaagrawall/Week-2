import java.util.Locale;

class PalindromeChecker{
    String text;

     public PalindromeChecker(String text) {
         this.text = text;
     }
     public String chcekPalindrome(String text){

         String isPalindrome="No , Not a Palindromic string";
         String str="";
         int j=text.length()-1;
         while (j>=0){
             str+=text.charAt(j);
             j--;
         }
         if(text.equals(str)) isPalindrome="Yes , Its an plaindromic string";
         return isPalindrome;
     }
     public  void display(String isPalindrome ){
         System.out.println("The "+text+ " is a palindromic string ?");
         System.out.println(isPalindrome);
     }
 }
public class PalindromeString {
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("naman") ;
        String isPalin=pc.chcekPalindrome("naman");
        pc.display(isPalin);
        String isPalin1=pc.chcekPalindrome("sweta");
        pc.display(isPalin1);

    }
}
