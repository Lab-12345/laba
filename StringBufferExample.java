public class StringBufferExample {
   public static void main(String[] args) {
       String str1 = "Hello";
       String str2 = "world";
       String str3 = "hello";
       String str4 = "Hello";
       
       StringBuilder sb = new StringBuilder(str1);
       sb.setCharAt(1, 'i');
       System.out.println("setCharAt() example: " + sb.toString());
       
       sb.setLength(2);
       System.out.println("setLength() example: " + sb.toString());
       
       sb.append(str2);
       System.out.println("append() example: " + sb.toString());
       
       System.out.println("concat() example: " + str1.concat(str2));
       
       System.out.println("equals() example 1: " + str1.equals(str3));
       System.out.println("equals() example 2: " + str1.equals(str4));
       
       StringBuffer sb1 = new StringBuffer("hello");
       StringBuffer sb2 = new StringBuffer("world");
       sb1.append(str2);
       System.out.println("append() example: " + sb1.toString());
       
       sb1.insert(1, str2);
       System.out.println("insert() example: " + sb1.toString());
   }
}
