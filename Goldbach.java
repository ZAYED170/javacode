import java.util.Scanner;
public  class Goldbach{
    public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter even number:");

        int num= sc.nextInt();
        for(int i=2;i<=num;i++){
            if(isprime(i) && isprime(num-i)){
                System.out.println(num+"="+i+"+"+(num-i));
            }
        }
    }
    static boolean isprime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}