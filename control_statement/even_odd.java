import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        int num;
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=n.nextInt();
        n.close();
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
