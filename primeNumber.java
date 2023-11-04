import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=input.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            
            }
            
        }
        if(count==0){
            System.out.println(num+" is a prime number");
        
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
