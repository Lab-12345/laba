public class NestedTry{
    public static void main(String[] args) {
        try{
        int []arr=new int[5];
        arr[10]=50;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("caught ArrayIndexout BoundsException in inner tey block");
        } 
     try {
        int num=Integer.parseInt("abc");
       }  catch(NumberFormatException e){
    System.out.println("caught NumberFormateException in outer try block");
        }catch(Exception e){
            System.out.println("caught Exception in outer try block");
        } 
     

    }
}