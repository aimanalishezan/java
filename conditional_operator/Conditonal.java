import java.util.Scanner;

public class Conditonal {
    public static void main(String[] args) {
        int num1,num2,large;
        Scanner input =new Scanner(System.in);
        System.out.print("Enter number one:");
        num1=input.nextInt();
        System.out.print("Enter number two:");
        
        num2=input.nextInt();
        large=(num1>num2)? num1:num2;//if the conditon is true then the ?will works if false then : will works
        System.out.println("large  number is :"+large);

        input.close();
    }
}
