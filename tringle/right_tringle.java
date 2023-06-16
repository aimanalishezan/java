import java.util.Scanner;

public class right_tringle {
    public static void main(String[] args) {
        double base,height,result;
        Scanner b = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        
        System.out.print("Enter the base:");
        base=b.nextDouble();
        System.out.print("Enter the height:");
        height=h.nextDouble();

        result=0.5*base*height;

        System.out.println("Area of a the tringle is :"+result);

        b.close();
        h.close();

        
    }
}
