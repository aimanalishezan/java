import java.util.Scanner;
public class if_else_if_else {
    public static void main(String[] args) {
        int num;
        Scanner n1=new Scanner(System.in);
        System.out.print("Enter the number:");
        num=n1.nextInt();
        n1.close();
        if(num<0){//when condition true its initialize the statement
            System.out.println("negative");
        }
        else if(num>0){//when if if false then come to it and  when it is true then initialize the statement
            System.out.println("possitive");
        }
        else{//when all condtion is false it will initialize the  statement
            System.out.println("number is:");
        }
    }
}
