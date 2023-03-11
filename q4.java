import java.util.Scanner;

public class q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a decimal num");
        int a=sc.nextInt();
        int rem=0;
        while (a!=0) {
            rem=a%2;
            rem=rem+a;
           System.out.print(rem); 
        }
        System.out.println(rem +" ");
    }
    
}
