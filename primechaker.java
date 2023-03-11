import java.util.Scanner;
public class primechaker{
    public static void main(String args[])
  {Scanner input=new Scanner(System.in);
  System.out.println("Enter a number");
  int num=input.nextInt();
boolean is_prime=true;
if(num<=1){
is_prime=false;
}else{for (int i = 2; i <=Math.sqrt(num); i++) {
    if (num % i==0) {
        is_prime=false;
        break;
    }
}}
if (is_prime) {
    System.out.println(num+"number is prime");
} else {
    System.out.println(num+"number is not prime");
}

}

}