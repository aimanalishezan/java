/*
 * for taking input from user you need to follow this steps--------
 * firts you need to import scanner for scannnig the input
 * then type--Scanner variable_name=new Scanner(System.in);
 * then get a vriable to store the data of user like this--variable=variable_name.nextLine();
 * then print the value
 * after all done you need to closed the scanner so that type
 * the name of it and close like this---variable.close();
 */
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        String name;
        int age;
        float hieght;
        
        Scanner input=new Scanner(System.in);
        Scanner a=new Scanner(System.in);
        Scanner h=new Scanner(System.in);

        
        System.out.print("Enter your name:");
        name=input.nextLine();//use mextLine to print the full string
        
        System.out.print("Enter your age:");
        age=a.nextInt();

        System.out.print("Enter your height:");
        hieght=h.nextFloat();

        System.out.println("***************************     ");
        System.out.println("Your name is :"+name);
        System.out.println("Your age is:"+age);
        System.out.println("Your height is:"+hieght);
        
        input.close();//never forgotte to close it 
        a.close();
        h.close();
    }
    
}
