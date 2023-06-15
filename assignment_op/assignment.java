import java.util.Scanner;
public class assignment {
    public static void main(String[] args) {
        int x,y,result;
        Scanner a=new Scanner(System.in);
        Scanner b=new Scanner(System.in);
        System.out.print("Enter the value of X:");
        x=a.nextInt();
        System.out.print("Enter the value of Y:");
        y=b.nextInt();
        result=x+=y;
        System.out.println("the sum is :"+result);
        result=x-=y;
        System.out.println("the sub is :"+result);
        result=x*=y;
        System.out.println("the multi is :"+result);
        result=x/=y;
        System.out.println("the div is :"+result);
        result=x%=y;
        System.out.println("the modulus is :"+result);
        

        a.close();
        b.close();
    }
}
