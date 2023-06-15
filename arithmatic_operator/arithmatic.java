import java.util.Scanner;
public class arithmatic {
        public static void main(String[] args) {
        int num1,num2,result;
        Scanner n1=new Scanner(System.in);
        Scanner n2=new Scanner(System.in);
        System.out.print("Enter number1:");
        num1=n1.nextInt();
        System.out.print("Enter number2:");
        num2=n2.nextInt();
        result=num1+num2;
        System.out.println("sum is="+result);
        result=num1-num2;
        System.out.println("sub is="+result);
        result=num1/num2;
        System.out.println("div is="+result);
        result=num1*num2;
        System.out.println("multy is="+result);
        result=num1%num2;
        System.out.println("modulus is="+result);
        n1.close();
        n2.close();
    }
}
