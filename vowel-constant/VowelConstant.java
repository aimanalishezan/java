    
import java.util.Scanner;
public class VowelConstant{
    public static void main(String[] args) {
        char ch;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter any character:");
        ch=input.next().charAt(0);
        if(ch=='a'){
            System.out.println("vowel");
        }
        else if(ch=='e'){
            System.out.println("vowel");
        }
        else if(ch=='i'){
            System.out.println("vowel");
        }
        else if(ch=='o'){
            System.out.println("vowel");
        }
        else if(ch=='u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("constant");
        }
        input.close();
    }
}
