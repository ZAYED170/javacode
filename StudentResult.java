import java.util.Scanner;
public class StudentResult{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark:");
        float  mark= sc.nextFloat();
        if(mark>=80)
            System.out.print("Grade A+");
        else if(mark>=70)
            System.out.print("Grade A");

        else if(mark>=60)
            System.out.print("Grade B");
        else 
            System.out.print("Fail");


    }
}