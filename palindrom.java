public class palindrom {
    public static void main(String[] args) {
        String input="nayan";
        boolean isPalindromeResult=isPalindrom(input);
        System.out.println("is palindrom:"+isPalindromeResult);
    }
       
      public static boolean isPalindrom(String str){
      int left=0 ,right=str.length()-1;
      while (left<right) {
        if (str.charAt(left)!=str.charAt(right)) {
        return false;
        }  left++;
        right--;        
    }
    return true;
}
}