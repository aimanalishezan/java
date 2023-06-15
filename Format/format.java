/*
 * format spacifier in java 
 * which helps you to understand which type of data you wants to print/or stored in variables
 * for intiger use %d
 * for character use %c
 * for float/double  use %f
 * for string and array use %s
 */


public class format {
    public static void main(String[]args){

        int age=19;
        char group='a';
        float degree=42.00f;
        double birth=12.2;
        String name="aiman";
        
        System.out.printf("age=%d\n",age);//use printf method for format specifier
        System.out.printf("group=%c\n",group);
        System.out.printf("degree=%.2f\n",degree);//use .2/3f enter the number you wants to print after the point
        System.out.printf("birth=%.2f\n",birth);
        System.out.printf("name=%s\n",name);
    }
}
