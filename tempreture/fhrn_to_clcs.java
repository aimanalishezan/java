/*
 * for celsius to fahrenheit use this formula
 * first get the celsius from the  user then use
 * 9/5*c+32
 */
import java.util.Scanner;
public class fhrn_to_clcs {
    public static void main(String[] args) {
        double fahrenheit,temp;
        Scanner f=new Scanner(System.in);
        System.out.print("Enter the temprature in fahrenheit:");
        fahrenheit=f.nextDouble();

        temp=(5/9)*(fahrenheit-32);
        System.out.println("the tempreture  in celsius is:"+temp);

        f.close();
    }
}
//github if you had a problem to commit and push the pg then click on pull rebase
