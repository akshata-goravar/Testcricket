import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        int sq=1;
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum=sum+dig;
            sq=sq*dig;
            num=num/10;
        }
        if(sq==sum){
            System.out.println("number is spy number");
        }
        else{
            System.out.println("number is not spy number");
        }
    }
}
