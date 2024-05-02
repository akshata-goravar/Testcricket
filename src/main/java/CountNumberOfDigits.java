import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("enter a number");
       int num=s.nextInt();
       int count=0;
       while(num>0){
           int dig=num%10;
           count++;
           num=num/10;
       }
       System.out.println(count);
    }
}
