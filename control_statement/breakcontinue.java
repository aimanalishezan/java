public class breakcontinue {
    public static void main(String[] args) {
        
        for(int i=1;i<=100;i++){
            if(i==10){
                continue;//it pass the statment and run the loop
            }
            else if(i>50){
                break;//when condition match it will stop the loop
            }
            System.out.println(i);
        }
        System.out.println("***********");
    }
}
