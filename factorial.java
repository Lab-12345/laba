import java.util.Scanner;
public class factorial {
    public static void main(String args[]){
        int p=1;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            p=p*i;
        }
        System.out.println("factorial of a "+n +"is="+p);
        
    }
    
}
