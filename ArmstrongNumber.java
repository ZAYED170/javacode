import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp!=0){
            int digit = temp % 10;
            sum = sum + (digit*digit*digit);
            temp = temp/10;

        }
        if(sum == num)
            System.out.print("Armstrong number");
        else
            System.out.print("Not Armstrong number");
    }
}