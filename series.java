import java.util.Scanner;

public class series{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the last number of the series:");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
            sum=sum+i;
            
        }
        System.out.println();
        System.out.println("the sum is :"+sum);
    }
}
